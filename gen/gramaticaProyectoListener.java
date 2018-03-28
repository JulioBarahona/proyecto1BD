// Generated from C:/Users/Julio/Desktop/Estudios/UVG/2018/Primer Semestre/Base de Datos/proyecto1\gramaticaProyecto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaProyectoParser}.
 */
public interface gramaticaProyectoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(gramaticaProyectoParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(gramaticaProyectoParser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#chat}.
	 * @param ctx the parse tree
	 */
	void enterChat(gramaticaProyectoParser.ChatContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#chat}.
	 * @param ctx the parse tree
	 */
	void exitChat(gramaticaProyectoParser.ChatContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(gramaticaProyectoParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(gramaticaProyectoParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(gramaticaProyectoParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(gramaticaProyectoParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(gramaticaProyectoParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(gramaticaProyectoParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(gramaticaProyectoParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(gramaticaProyectoParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void enterEmoticon(gramaticaProyectoParser.EmoticonContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void exitEmoticon(gramaticaProyectoParser.EmoticonContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(gramaticaProyectoParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(gramaticaProyectoParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(gramaticaProyectoParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(gramaticaProyectoParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#mention}.
	 * @param ctx the parse tree
	 */
	void enterMention(gramaticaProyectoParser.MentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#mention}.
	 * @param ctx the parse tree
	 */
	void exitMention(gramaticaProyectoParser.MentionContext ctx);
}