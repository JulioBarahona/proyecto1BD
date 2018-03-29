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
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#sql2003Parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql2003Parser(gramaticaProyectoParser.Sql2003ParserContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#sql_executable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_executable_statement(gramaticaProyectoParser.Sql_executable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#sql_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_schema_statement(gramaticaProyectoParser.Sql_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_schema_definition_statement(gramaticaProyectoParser.Sql_schema_definition_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_schema_manipulation_statement(gramaticaProyectoParser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#sql_data_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_data_statement(gramaticaProyectoParser.Sql_data_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#schema_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_definition(gramaticaProyectoParser.Schema_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_definition(gramaticaProyectoParser.Table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_schema_statement(gramaticaProyectoParser.Drop_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterAddColumn}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAddColumn(gramaticaProyectoParser.AlterAddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterAddConstraint}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAddConstraint(gramaticaProyectoParser.AlterAddConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterDropColumn}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDropColumn(gramaticaProyectoParser.AlterDropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterDropConstraint}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDropConstraint(gramaticaProyectoParser.AlterDropConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#idTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTable(gramaticaProyectoParser.IdTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#idColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdColumn(gramaticaProyectoParser.IdColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#idConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdConstraint(gramaticaProyectoParser.IdConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#drop_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_statement(gramaticaProyectoParser.Drop_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#alter_database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database_statement(gramaticaProyectoParser.Alter_database_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#show_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_schema_statement(gramaticaProyectoParser.Show_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#use_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_schema_statement(gramaticaProyectoParser.Use_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code column_literal}
	 * labeled alternative in {@link gramaticaProyectoParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_literal(gramaticaProyectoParser.Column_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code column_constraint}
	 * labeled alternative in {@link gramaticaProyectoParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(gramaticaProyectoParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_lit_int}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_lit_int(gramaticaProyectoParser.Tipo_lit_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_lit_float}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_lit_float(gramaticaProyectoParser.Tipo_lit_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_lit_char}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_lit_char(gramaticaProyectoParser.Tipo_lit_charContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_lit_date}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_lit_date(gramaticaProyectoParser.Tipo_lit_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(gramaticaProyectoParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constraintTypePrimaryKey}
	 * labeled alternative in {@link gramaticaProyectoParser#constraintType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintTypePrimaryKey(gramaticaProyectoParser.ConstraintTypePrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constraintTypeForeignKey}
	 * labeled alternative in {@link gramaticaProyectoParser#constraintType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintTypeForeignKey(gramaticaProyectoParser.ConstraintTypeForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constraintTypeCheck}
	 * labeled alternative in {@link gramaticaProyectoParser#constraintType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintTypeCheck(gramaticaProyectoParser.ConstraintTypeCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#idRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdRef(gramaticaProyectoParser.IdRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#localIDS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalIDS(gramaticaProyectoParser.LocalIDSContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#refIDS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefIDS(gramaticaProyectoParser.RefIDSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_logic}
	 * labeled alternative in {@link gramaticaProyectoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_logic(gramaticaProyectoParser.Exp_logicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_logic_not}
	 * labeled alternative in {@link gramaticaProyectoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_logic_not(gramaticaProyectoParser.Exp_logic_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_relational}
	 * labeled alternative in {@link gramaticaProyectoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relational(gramaticaProyectoParser.Exp_relationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#rename_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_table_statement(gramaticaProyectoParser.Rename_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#show_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_table_statement(gramaticaProyectoParser.Show_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#show_column_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_column_statement(gramaticaProyectoParser.Show_column_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logic_and}
	 * labeled alternative in {@link gramaticaProyectoParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_and(gramaticaProyectoParser.Logic_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logic_or}
	 * labeled alternative in {@link gramaticaProyectoParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_or(gramaticaProyectoParser.Logic_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#logic_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_not(gramaticaProyectoParser.Logic_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(gramaticaProyectoParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#insert_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_value(gramaticaProyectoParser.Insert_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#update_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_value(gramaticaProyectoParser.Update_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(gramaticaProyectoParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#delete_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_value(gramaticaProyectoParser.Delete_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#select_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_value(gramaticaProyectoParser.Select_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#nID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNID(gramaticaProyectoParser.NIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#nlocalIDS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNlocalIDS(gramaticaProyectoParser.NlocalIDSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orderUni}
	 * labeled alternative in {@link gramaticaProyectoParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderUni(gramaticaProyectoParser.OrderUniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orderMulti}
	 * labeled alternative in {@link gramaticaProyectoParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderMulti(gramaticaProyectoParser.OrderMultiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionCond}
	 * labeled alternative in {@link gramaticaProyectoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionCond(gramaticaProyectoParser.ConditionCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionComp}
	 * labeled alternative in {@link gramaticaProyectoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionComp(gramaticaProyectoParser.ConditionCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionNot}
	 * labeled alternative in {@link gramaticaProyectoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionNot(gramaticaProyectoParser.ConditionNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compId}
	 * labeled alternative in {@link gramaticaProyectoParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompId(gramaticaProyectoParser.CompIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compLitId}
	 * labeled alternative in {@link gramaticaProyectoParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompLitId(gramaticaProyectoParser.CompLitIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compLit}
	 * labeled alternative in {@link gramaticaProyectoParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompLit(gramaticaProyectoParser.CompLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(gramaticaProyectoParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna(gramaticaProyectoParser.ColumnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(gramaticaProyectoParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(gramaticaProyectoParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(gramaticaProyectoParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#float_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_literal(gramaticaProyectoParser.Float_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(gramaticaProyectoParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaProyectoParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(gramaticaProyectoParser.Char_literalContext ctx);
}