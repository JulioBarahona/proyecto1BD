import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.JTextComponent;
import javax.swing.text.Utilities;
import javax.swing.undo.UndoManager;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generatedsources.sqlLexer;
import generatedsources.sqlParser;
import javafx.scene.control.TreeView;
import views.LineNumberTableRowHeader;
import views.TextLineNumber;
import views.Tree;
import views.TreePanel;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class DBMSgui extends JFrame implements ActionListener {


    JMenuItem miOpen, miSave, miSaveAs, miUndo, miRedo, miRun, miComment, miCut, miCopy, miPaste;
    JButton btnOpen, btnSave, btnRun, btnUndo, btnRedo, btnDelete;
    JTextField status, dataBaseUse;
    JCheckBox verboseBox;
    JFileChooser fileChooser;
    UndoManager undoManager;
    File file;
    JTextPane textArea;
    JTextPane OutputArea, verboseArea;
    JTabbedPane tabbedPane, tabbedPaneQuery;
    JSplitPane izqder,arribajo;
    TreePanel tree;
    String comment = "//", text = "";
    boolean verboseTrue = false;
    ArrayList<String> verbose = new ArrayList<String>();
    int caretLine = 1, caretColumn = 1;

    dbmsVisitor<Object> semantic_checker = new dbmsVisitor();


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DBMSgui window = new DBMSgui();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public DBMSgui() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {// falta tree
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        this.setBounds(100, 100, (width/2), (height/2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fileChooser = new JFileChooser();
        undoManager = new UndoManager();

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        menuBar.setBackground(Color.DARK_GRAY);

        JMenu menuFile = new JMenu("File");
        menuFile.setForeground(Color.white);
        menuBar.add(menuFile);

        miOpen = new JMenuItem("Open");
        KeyStroke keyStrokeToOpen = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
        miOpen.setAccelerator(keyStrokeToOpen);
        miOpen.addActionListener(this);
        menuFile.add(miOpen);

        miSave = new JMenuItem("Save");
        KeyStroke keyStrokeToSave = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
        miSave.setAccelerator(keyStrokeToSave);
        miSave.addActionListener(this);
        menuFile.add(miSave);

        miSaveAs = new JMenuItem("Save As");
        miSaveAs.addActionListener(this);
        menuFile.add(miSaveAs);

        JMenu menuEdit = new JMenu("Edit");
        menuEdit.setForeground(Color.WHITE);
        menuBar.add(menuEdit);

        miUndo = new JMenuItem("Undo");
        KeyStroke keyStrokeToUndo = KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK);
        miUndo.setAccelerator(keyStrokeToUndo);
        miUndo.addActionListener(this);
        menuEdit.add(miUndo);

        miRedo = new JMenuItem("Redo");
        KeyStroke keyStrokeToRedo = KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_DOWN_MASK);
        miRedo.setAccelerator(keyStrokeToRedo);
        miRedo.addActionListener(this);
        menuEdit.add(miRedo);

        miCut = new JMenuItem("Cut");
        KeyStroke keyStrokeToCut = KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK);
        miCut.setAccelerator(keyStrokeToCut);
        miCut.addActionListener(this);
        menuEdit.add(miCut);

        miCopy = new JMenuItem("Copy");
        KeyStroke keyStrokeToCopy = KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK);
        miCopy.setAccelerator(keyStrokeToCut);
        miCopy.addActionListener(this);
        menuEdit.add(miCopy);

        miPaste = new JMenuItem("Paste");
        KeyStroke keyStrokeToPaste = KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK);
        miPaste.setAccelerator(keyStrokeToCut);
        miPaste.addActionListener(this);
        menuEdit.add(miCopy);

        miComment = new JMenuItem("Comment");
        miComment.addActionListener(this);
        menuEdit.add(miComment);

        JMenu menuRun = new JMenu("Run");
        menuRun.setForeground(Color.WHITE);
        menuBar.add(menuRun);

        miRun = new JMenuItem("Run");
        KeyStroke keyStrokeToRun = KeyStroke.getKeyStroke(KeyEvent.VK_F5,0);
        miRun.setAccelerator(keyStrokeToRun);
        miRun.addActionListener(this);
        menuRun.add(miRun);

        JToolBar toolBar = new JToolBar();
        this.getContentPane().add(toolBar, BorderLayout.NORTH);

        btnOpen = new JButton("Open");
        btnOpen.setToolTipText("Open");
        btnOpen.addActionListener(this);
        try{
            Image img = ImageIO.read(getClass().getClassLoader().getResource("imagenes/open.png"));
            btnOpen.setIcon(new ImageIcon(img));
            btnOpen.setText("");
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btnOpen.setBorder(emptyBorder);
        }
        catch (Exception e){
            System.out.println("Error in imagenes/open.png");
        }
        toolBar.add(btnOpen);

        btnSave = new JButton("Save");
        btnSave.addActionListener(this);
        btnSave.setToolTipText("Save");
        try{
            Image img = ImageIO.read(getClass().getClassLoader().getResource("imagenes/save.png"));
            btnSave.setIcon(new ImageIcon(img));
            btnSave.setText("");
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btnSave.setBorder(emptyBorder);
        } catch (Exception e){
            System.out.println("Error in imagenes/save.png");
        }
        toolBar.add(btnSave);

        JButton btnCut = new JButton(new DefaultEditorKit.CutAction());
        btnCut.setText("Cut");
        btnCut.setToolTipText("Cut");
        try{
            Image img = ImageIO.read(getClass().getClassLoader().getResource("imagenes/Cut.png"));
            btnCut.setIcon(new ImageIcon(img));
            btnCut.setText("");
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btnCut.setBorder(emptyBorder);
        } catch (Exception e){
            System.out.println("Error in imagenes/Cut.png");
        }
        toolBar.add(btnCut);

        JButton btnCopy = new JButton(new DefaultEditorKit.CopyAction());
        btnCopy.setText("Copy");
        btnCopy.setToolTipText("Copy");
        try{
            Image img = ImageIO.read(getClass().getClassLoader().getResource("imagenes/copy.png"));
            btnCopy.setIcon(new ImageIcon(img));
            btnCopy.setText("");
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btnCopy.setBorder(emptyBorder);
        } catch (Exception e){
            System.out.println("Error in imagenes/copy.png");
        }
        toolBar.add(btnCopy);

        JButton btnPaste = new JButton(new DefaultEditorKit.PasteAction());
        btnPaste.setText("Paste");
        btnPaste.setToolTipText("Paste");
        try{
            Image img = ImageIO.read(getClass().getClassLoader().getResource("imagenes/paste.png"));
            btnPaste.setIcon(new ImageIcon(img));
            btnPaste.setText("");
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btnPaste.setBorder(emptyBorder);
        } catch (Exception e){
            System.out.println("Error in imagenes/paste.png");
        }
        toolBar.add(btnPaste);

        btnUndo = new JButton("Undo");
        btnUndo.addActionListener(this);
        btnUndo.setToolTipText("Undo");
        try{
            Image img = ImageIO.read(getClass().getClassLoader().getResource("imagenes/undo.png"));
            btnUndo.setIcon(new ImageIcon(img));
            btnUndo.setText("");
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btnUndo.setBorder(emptyBorder);
        } catch (Exception e){
            System.out.println("Error in imagenes/undo.png");
        }
        toolBar.add(btnUndo);

        btnRedo = new JButton("Redo");
        btnRedo.addActionListener(this);
        btnRedo.setToolTipText("Redo");
        try{
            Image img = ImageIO.read(getClass().getClassLoader().getResource("imagenes/redo.png"));
            btnRedo.setIcon(new ImageIcon(img));
            btnRedo.setText("");
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btnRedo.setBorder(emptyBorder);
        } catch (Exception e){
            System.out.println("Error in imagenes/redo.png");
        }
        toolBar.add(btnRedo);

        btnRun = new JButton("Run");
        btnRun.addActionListener(this);
        btnRun.setToolTipText("Run");
        try{
            Image img = ImageIO.read(getClass().getClassLoader().getResource("imagenes/play.png"));
            btnRun.setIcon(new ImageIcon(img));
            btnRun.setText("");
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btnRun.setBorder(emptyBorder);
        } catch (Exception e){
            System.out.println("Error in imagenes/play.png");
        }
        toolBar.add(btnRun);

        btnDelete = new JButton("Delete All");
        btnDelete.addActionListener(this);
        btnDelete.setToolTipText("Delete all text from editor");
        try{
            Image img = ImageIO.read(getClass().getClassLoader().getResource("imagenes/erase.png"));
            btnDelete.setIcon(new ImageIcon(img));
            btnDelete.setText("");
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btnDelete.setBorder(emptyBorder);
        } catch (Exception e){
            System.out.println("Error in imagenes/erase.png");
        }
        toolBar.add(btnDelete);
        toolBar.setBackground(Color.darkGray);
        toolBar.setFloatable(false);
        verboseBox = new JCheckBox("Verbose");
        verboseBox.addActionListener(this);
        verboseBox.setBackground(Color.DARK_GRAY);
        verboseBox.setForeground(Color.WHITE);

        toolBar.add(verboseBox);

        izqder = new JSplitPane();
        izqder.setResizeWeight(0.8);
        izqder.setContinuousLayout(true);
        izqder.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        this.getContentPane().add(izqder, BorderLayout.CENTER);

        tree = new TreePanel();
        addTreeSelection(tree.getTree());
        izqder.setRightComponent(tree);

        arribajo = new JSplitPane();
        arribajo.setResizeWeight(0.5);
        arribajo.setContinuousLayout(true);
        arribajo.setOrientation(JSplitPane.VERTICAL_SPLIT);
        arribajo.setBackground(Color.DARK_GRAY);
        izqder.setLeftComponent(arribajo);

        textArea = new JTextPane();
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setForeground(Color.WHITE);
        textArea.getDocument().addUndoableEditListener(undoManager);
        textArea.setCaretColor(Color.WHITE);
        setCaretListener(textArea);
        JScrollPane scroll = new JScrollPane (textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        tabbedPaneQuery = new JTabbedPane(JTabbedPane.TOP);
        tabbedPaneQuery.addTab("Query Tool", null, scroll,null);
        tabbedPaneQuery.setBackground(Color.GRAY);
        TextLineNumber tln = new TextLineNumber(textArea);
        scroll.setRowHeaderView(tln);
        arribajo.setLeftComponent(tabbedPaneQuery);

        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBackground(Color.LIGHT_GRAY);
        tabbedPane.setForeground(Color.black);
        arribajo.setRightComponent(tabbedPane);

        JScrollPane scroll1 = new JScrollPane();
        tabbedPane.addTab("Data Output", null, scroll1, null);
        OutputArea = new JTextPane();
        OutputArea.setBackground(Color.DARK_GRAY);
        OutputArea.setForeground(Color.WHITE);
        OutputArea.setEditable(false);
        scroll1.setViewportView(OutputArea);

        JScrollPane scroll2 = new JScrollPane();
        tabbedPane.addTab("Verbose", null, scroll2, null);
        verboseArea = new JTextPane();
        verboseArea.setBackground(Color.DARK_GRAY);
        verboseArea.setForeground(Color.WHITE);
        verboseArea.setEditable(false);
        scroll2.setViewportView(verboseArea);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == miOpen ||
                e.getSource() == btnOpen){
            open();
        }else if (e.getSource() == miSave ||
                e.getSource() == btnSave){
            save();
        }else if (e.getSource() == miSaveAs){
            saveAs();
            tree.revalidate();
            tree.repaint();
            addTreeSelection(tree.getTree());
        }else if (e.getSource() == miUndo ||
                e.getSource() == btnUndo){
            undo();
        }else if (e.getSource() == miRedo ||
                e.getSource() == btnRedo){
            redo();
        }else if (e.getSource() == miRun ||
                e.getSource() == btnRun){
            run();
            tree.revalidate();
            tree.repaint();
            addTreeSelection(tree.getTree());
        }else if (e.getSource() == miComment){
            comment();
        }else if (e.getSource() == btnDelete){
            textArea.setText("");
        }else if (e.getSource() == verboseBox){
            if(!verboseTrue){
                verboseBox.setToolTipText("Disable Verbose");
                verboseTrue = true;
            }
            else{
                verboseBox.setToolTipText("Enable Verbose");
                verboseTrue = false;
                verboseArea.setText("");
            }
        }

    }

    private void redo() {
        // TODO Auto-generated method stub
        try{
            undoManager.redo();
        }catch (Exception e){
            //to do
        }
    }

    private void comment() {
        // TODO Auto-generated method stub
        String text = textArea.getText(), newTxt = "";
        try{
            int caretpos = textArea.getCaretPosition();


            int lineCount = 1;
            int i = 0;
            boolean condition = true;
            while (condition){
                if (lineCount == caretLine){//if we reach the same line as the caret

                    if (text.length()>0){
                        if (text.length() >= i+comment.length()){//if there is a chance of '//' presence
                            String subst = text.substring(i,i+comment.length());
                            if (subst.equals(comment)){
                                newTxt = text.substring(0,i) + text.substring(i+comment.length());

                            }else{
                                newTxt = text.substring(0,i)+ comment + text.substring(i);
                            }
                        }else{
                            newTxt = text.substring(0,i)+ comment + text.substring(i);
                        }

                    }else{
                        newTxt = comment + text;
                    }
                    i = text.length()-1;//to evaluate text.charAt even if we dont need it
                }
                if (text.length()>0)
                    if (text.charAt(i) == '\n'){//if it's a new line
                        lineCount++;
                    }
                i++;
                condition = i < text.length();
            }
            textArea.setText(newTxt);
            textArea.setCaretPosition(caretpos);


        } catch (Exception e){
            textArea.setText(text);
            //System.out.println(e);
        }
    }

    private void run() {
        try{

            OutputArea.setText("...");
            text = textArea.getSelectedText();
            if (text == null)
                text = textArea.getText();//

            // Create DataBase
            long startTime = System.nanoTime();
            ANTLRInputStream input = new ANTLRInputStream(text);

            sqlLexer lexer = new sqlLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            sqlParser parser = new sqlParser(tokens);

            //errores sintacticos
            parser.removeErrorListeners();
            parser.addErrorListener(descriptiveErrorListener.INSTANCE);

            ParseTree tree = parser.sql2003Parser(); // begin parsing at rule 'sql2003Parser'

            if (!descriptiveErrorListener.errors.isEmpty()){
                OutputArea.setText(descriptiveErrorListener.errors);
                descriptiveErrorListener.errors = "";
                return ;
            }


            Object obj = (Object)semantic_checker.visit(tree);
            semantic_checker.guardarDBs();

            long estimatedTime = System.nanoTime()-startTime;
            if (obj instanceof Schema){
                Schema dbs = (Schema) obj;
                addNewTab(dbs);
            }else if (obj instanceof Table){
                Table tb = (Table) obj;
                addNewTab(tb);
            }

            // Generar verbose
            if (verboseTrue){
                this.verbose = new ArrayList<String>();
                this.recursiveRoot(tree);
                verboseArea.setText(toStringVerbose());
            }
            //System.out.println(this.toStringVerbose());

            if (!semantic_checker.erroresToString().isEmpty())
                OutputArea.setText(semantic_checker.erroresToString()+"\n"+calculateTime(estimatedTime));
            else
                OutputArea.setText(semantic_checker.toStringMessages()+"\n" + "Completed in: "+"\n"+calculateTime(estimatedTime));

            semantic_checker.resetValues();
            //splitPane1.setLeftComponent(new SimpleTree());
        } catch (Exception e){

        }

    }

    private void undo() {
        // TODO Auto-generated method stub
        try{
            undoManager.undo();
        }catch (Exception e){
            //to do
            System.out.println("no sirve");
        }
    }

    private void saveAs() {
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            try{
                PrintWriter writer = new PrintWriter(file.getAbsolutePath(), "UTF-8");
                writer.print(textArea.getText());
                writer.close();
            }catch (Exception e ){
                System.out.println("Error saving file");
            }

            System.out.println(file.getAbsolutePath());

        } else {

        }
    }

    private void save() {
        if (file != null){
            System.out.println("Saved in "+ file.getAbsolutePath());
            try{
                PrintWriter writer = new PrintWriter(file.getAbsolutePath(), "UTF-8");
                writer.print(textArea.getText());
                writer.close();
            }catch (Exception e ){
                System.out.println("Error saving file");
            }

        }else{
            saveAs();
        }
    }

    public void open(){

        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION){
            file = fileChooser.getSelectedFile();
            miSave.setEnabled(true);
            btnSave.setEnabled(true);
            try{

                Scanner scanner = new Scanner(file);
                String newTxt = "";
                while (scanner.hasNextLine()){
                    newTxt += scanner.nextLine()+"\n";
                }
                textArea.setText(newTxt);
                //System.out.println(newTxt);
                scanner.close();
                //br.close();
            } catch (Exception e){
                //e.printStackTrace();
                System.out.println("Error opening file");
            }


            //System.out.println(file.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(null,"\n no file found","WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void setCaretListener(JTextPane textArea2){
        // Add a caretListener to the editor. This is an anonymous class because it is inline and has no specific name.
        textArea2.addCaretListener(new CaretListener() {
            // Each time the caret is moved, it will trigger the listener and its method caretUpdate.
            // It will then pass the event to the update method including the source of the event (which is our textarea control)
            public void caretUpdate(CaretEvent e) {
                //JTextArea editArea = (JTextArea)e.getSource();
                //JTextPane editArea = (JTextPane)e.getSource();

                // Lets start with some default values for the line and column.


                // We create a try catch to catch any exceptions. We will simply ignore such an error for our demonstration.
                try {
                    // First we find the position of the caret. This is the number of where the caret is in relation to the start of the JTextArea
                    // in the upper left corner. We use this position to find offset values (eg what line we are on for the given position as well as
                    // what position that line starts on.
                    //int caretpos = e.getCaretPosition();

                    //(caretpos == 0) ? 1:0;


                    caretLine = getRow(e.getDot(),(JTextComponent)e.getSource());
                    //caretLine = editArea.getLineOfOffset(caretpos);

                    // We subtract the offset of where our line starts from the overall caret position.
                    // So lets say that we are on line 5 and that line starts at caret position 100, if our caret position is currently 106
                    // we know that we must be on column 6 of line 5.
                    caretColumn = getColumn(e.getDot(), (JTextComponent)e.getSource())-1;
                    //caretColumn = caretpos - editArea.getLineStartOffset(caretLine);

                    // We have to add one here because line numbers start at 0 for getLineOfOffset and we want it to start at 1 for display.
                    //caretLine += 1;
                }
                catch(Exception ex) { }

                // Once we know the position of the line and the column, pass it to a helper function for updating the status bar.

            }
        });

    }

    public int getRow(int pos, JTextComponent editor) {
        int rn = (pos==0) ? 1 : 0;
        try {
            int offs=pos;
            while( offs>0) {
                offs=Utilities.getRowStart(editor, offs)-1;
                rn++;
            }
        } catch (BadLocationException e) {
            e.printStackTrace();

        }
        return rn;
    }

    public int getColumn(int pos, JTextComponent editor) {
        try {
            return pos-Utilities.getRowStart(editor, pos)+1;
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public String toStringVerbose()
    {
        String ret = "";
        for (String i: this.verbose)
            ret += i + "\n";
        return ret;
    }

    public void addNewTab(File file){
        try{
            String path = file.getAbsolutePath();
            String name = file.getName();
            FileInputStream fis = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new FileReader(path));

            if (br.readLine() != null)
            {
                ObjectInputStream in = new ObjectInputStream(fis);
                Object obj = in.readObject();
                if (obj instanceof Table){
                    Path currentRelativePath = Paths.get("");
                    String dataPath = currentRelativePath.toAbsolutePath().toString() + "\\data\\";
                    FileInputStream fis1 = new FileInputStream(dataPath+"dbs.bin");
                    BufferedReader br1 = new BufferedReader(new FileReader(dataPath+"dbs.bin"));
                    Schema schemas = null;
                    if (br1.readLine() != null)
                    {
                        ObjectInputStream in1 = new ObjectInputStream(fis1);
                        schemas = (Schema)in1.readObject();

                        in1.close();
                    }
                    fis1.close();
                    br1.close();
                    if (schemas != null){

                        String dataBaseName = file.getParentFile().getName();

                        DataBase dataBase = null;

                        for (int i = 0; i < schemas.getSchema().size(); i++){
                            if (schemas.getSchema().get(i).getName().equals(dataBaseName)){
                                dataBase = schemas.getSchema().get(i);
                            }
                        }

                        if (dataBase != null){

                            Table dataBaseTable = dataBase.getTable(name.substring(0, name.length()-4));//quito .bin

                            if (dataBaseTable != null){
                                addNewTab(dataBaseTable);
                            }else if (obj instanceof Schema){
                                Schema schema = (Schema)obj;
                                addNewTab(schema);
                                //table = createNewTable(schemas);
                                //System.out.println(schemas);
                            }


                            in.close();
                        }

                    }
                    br.close();
                    fis.close();
                }
            }
        } catch (Exception e){
            //e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    public void addNewTab(Schema schemas){
        String name = "dbs.bin";
        JTable table = null;
        JScrollPane scrollPane_1 = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //JScrollPane scrollPane_1 = new JScrollPane();


        table = createNewTable(schemas);
        if (table != null){
            LineNumberTableRowHeader tableLineNumber = new LineNumberTableRowHeader(scrollPane_1,table);
            scrollPane_1.setRowHeaderView(tableLineNumber);
            scrollPane_1.setViewportView(table);
            //if (tabbedPane.indexOfComponent(scrollPane_1) == -1)
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tabbedPane.add(scrollPane_1);
            tabbedPane.setTabComponentAt(tabbedPane.indexOfComponent(scrollPane_1), getTitlePanel(tabbedPane,(Component)scrollPane_1,name));
            tabbedPane.setSelectedIndex(tabbedPane.getComponentCount()-2);
        }
    }

    public void addNewTab(Table tableObj){
        String name = tableObj.getName();
        JTable table = null;
        JScrollPane scrollPane_1 = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //JScrollPane scrollPane_1 = new JScrollPane();


        table = createNewTable(tableObj);
        if (table != null){
            LineNumberTableRowHeader tableLineNumber = new LineNumberTableRowHeader(scrollPane_1,table);
            //tableLineNumber.setBackground(Color.LIGHT_GRAY);
            scrollPane_1.setRowHeaderView(tableLineNumber);
            scrollPane_1.setViewportView(table);
            //if (tabbedPane.indexOfComponent(scrollPane_1) == -1)
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tabbedPane.add(scrollPane_1);
            tabbedPane.setTabComponentAt(tabbedPane.indexOfComponent(scrollPane_1), getTitlePanel(tabbedPane,(Component)scrollPane_1,name));
            tabbedPane.setSelectedIndex(tabbedPane.getComponentCount()-2);
        }
    }

    public JTable createNewTable(Table table){
        ArrayList<String> nombres = new ArrayList();
        ArrayList<String> tooltip = new ArrayList();
        ArrayList<Attribute> atributos = table.getattributes();
        for (Attribute at: atributos){
            nombres.add(at.getId());
            tooltip.add(table.IDtoString(at.getId()).replace("and"," and ").replace("or"," or ").replace("not"," not ").replace("<", " &lt ").replace(">", " &gt ").replace("\n", "<br/>"));

        }

        Object [] columnNames = nombres.toArray();
        Object [] columnTooltip = tooltip.toArray();



        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        for (ArrayList<String> tupla: table.getData()){
            //System.out.println("tupla: "+tupla);
            Object[] objs = (Object[]) tupla.toArray();
            //if (objs.length > 0)
            tableModel.addRow(objs);

        }
        //System.out.println("Ya llego a crear la tabla");
        //if (tableModel.getRowCount()>0){
        JTable nTable = new JTable(tableModel){
            protected JTableHeader createDefaultTableHeader(){
                return new JTableHeader(columnModel){
                    public String getToolTipText(MouseEvent e){
                        java.awt.Point p = e.getPoint();try{
                            int index = columnModel.getColumnIndexAtX(p.x);
                            int realIndex = columnModel.getColumn(index).getModelIndex();
                            //System.out.println((String)columnTooltip[realIndex]);
                            return "<html>"+(String)columnTooltip[realIndex]+"</html>";
                        } catch (Exception ex){
                            return null;
                        }
                    }
                };
            }
        };
        nTable.setEnabled(false);
        return nTable;
        //}
        //return null;
    }

    public JTable createNewTable(Schema schemas){
        String [] columnNames = {"Database","Table Number"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        for (DataBase st: schemas.getSchema()){
            Object[] objs = {st.getName(), st.getTables().size()};
            //if (objs.length > 0)
            tableModel.addRow(objs);
        }
        //if (tableModel.getRowCount()>0){
        JTable nTable = new JTable(tableModel);
        nTable.setEnabled(false);
        return nTable;
        //}
        //return null;
    }

    public JPanel getTitlePanel(final JTabbedPane tabbedPane, final Component panel, String title){
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        titlePanel.setOpaque(false);
        JLabel titleLbl = new JLabel(title);
        titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        titlePanel.add(titleLbl);
        JButton closeButton = new JButton("x");

        Border emptyBorder = BorderFactory.createEmptyBorder();
        closeButton.setBorder(emptyBorder);
        //closeButton.setOpaque(true);

        closeButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                tabbedPane.remove(panel);
            }
        });
        titlePanel.add(closeButton);

        return titlePanel;
    }

    public void recursiveRoot(ParseTree tree)
    {
        // Listado inicial de elementos
        List<ParseTree> childs = new ArrayList<>();
        for (int i=0; i < tree.getChildCount(); i++)
            childs.add(tree.getChild(i));

        // Recorrer listado inicial
        for (ParseTree i: childs)
        {
            if (i.getChildCount() != 0)
            {
                String ruleName = i.getClass().getSimpleName().replace("Context", "");
                ruleName = Character.toLowerCase(ruleName.charAt(0)) + ruleName.substring(1);
                this.verbose.add(ruleName);
                recursiveRoot(i);
            }
        }
    }

    public String calculateTime(long nanoTime){
        String str = "Estimated time: ";
        long hr, min, sec, msec, nsec, time = 0;
        if ((hr = TimeUnit.NANOSECONDS.toHours(nanoTime))>0){
            str += ""+hr+"hr ";
            time = time+hr*60;
        }
        if ((min = TimeUnit.NANOSECONDS.toMinutes(nanoTime))>0){
            min = min-time;
            str += ""+min+"min ";
            time = (time + min)*60;
        }
        if ((sec = TimeUnit.NANOSECONDS.toSeconds(nanoTime))>0){
            sec = sec-time;
            str += ""+sec+"s ";
            time = (time + sec)*1000;
        }
        if ((msec = TimeUnit.NANOSECONDS.toMillis(nanoTime))>0){
            msec = msec-time;
            str += ""+msec+"ms ";
            time = (time + msec)*1000000;
        }
        if ((nsec = TimeUnit.NANOSECONDS.toNanos(nanoTime))>0)
            nsec = nsec-time;
        str += ""+nsec+"ns ";

        return str;
    }

    public void addTreeSelection(JTree tree){
        tree.addTreeSelectionListener(new TreeSelectionListener(){
            public void valueChanged(TreeSelectionEvent event){
                File file = (File) tree.getLastSelectedPathComponent();
                addNewTab(file);
            }
        });
    }


}