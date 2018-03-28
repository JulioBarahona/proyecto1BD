package me.tomassetti.examples.MarkupParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class AntlrParser {

    public static void main(String[] args) throws IOException{
            ANTLRInputStream inputStream = new ANTLRInputStream(
                    "I would like to [b][i]emphasize[/i][/b] this and [u]underline [b]that[/b][/u] ." +
                    "Let's not forget to quote: [quote author="John"]You're wrong![/quote]");
            MarkupLexer markupLexer = new MarkupLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
            MarkupParser markupParser = new MarkupParser(commonTokenStream);

            MarkupParser.FileContext fileContext = markupParser.file();
            MarkupVisitor visitor = new MarkupVisitor();
            visitor.visit(fileContext);
    }

}
