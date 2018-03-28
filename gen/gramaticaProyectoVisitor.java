// Generated from C:/Users/Julio/Desktop/Estudios/UVG/2018/Primer Semestre/Base de Datos/proyecto1\gramaticaProyecto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaProyectoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaProyectoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(gramaticaProyectoParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#chat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChat(gramaticaProyectoParser.ChatContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(gramaticaProyectoParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(gramaticaProyectoParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(gramaticaProyectoParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(gramaticaProyectoParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#emoticon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmoticon(gramaticaProyectoParser.EmoticonContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(gramaticaProyectoParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(gramaticaProyectoParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#mention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMention(gramaticaProyectoParser.MentionContext ctx);
}