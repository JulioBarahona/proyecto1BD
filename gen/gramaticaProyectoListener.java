// Generated from C:/Users/Julio/Desktop/Estudios/UVG/2018/Primer Semestre/Base de Datos/proyecto1\gramaticaProyecto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaProyectoParser}.
 */
public interface gramaticaProyectoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#sql2003Parser}.
	 * @param ctx the parse tree
	 */
	void enterSql2003Parser(gramaticaProyectoParser.Sql2003ParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#sql2003Parser}.
	 * @param ctx the parse tree
	 */
	void exitSql2003Parser(gramaticaProyectoParser.Sql2003ParserContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#sql_executable_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_executable_statement(gramaticaProyectoParser.Sql_executable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#sql_executable_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_executable_statement(gramaticaProyectoParser.Sql_executable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_statement(gramaticaProyectoParser.Sql_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_statement(gramaticaProyectoParser.Sql_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_definition_statement(gramaticaProyectoParser.Sql_schema_definition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_definition_statement(gramaticaProyectoParser.Sql_schema_definition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_manipulation_statement(gramaticaProyectoParser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_manipulation_statement(gramaticaProyectoParser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_data_statement(gramaticaProyectoParser.Sql_data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_data_statement(gramaticaProyectoParser.Sql_data_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#schema_definition}.
	 * @param ctx the parse tree
	 */
	void enterSchema_definition(gramaticaProyectoParser.Schema_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#schema_definition}.
	 * @param ctx the parse tree
	 */
	void exitSchema_definition(gramaticaProyectoParser.Schema_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_definition(gramaticaProyectoParser.Table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_definition(gramaticaProyectoParser.Table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema_statement(gramaticaProyectoParser.Drop_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema_statement(gramaticaProyectoParser.Drop_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterAddColumn}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterAddColumn(gramaticaProyectoParser.AlterAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterAddColumn}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterAddColumn(gramaticaProyectoParser.AlterAddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterAddConstraint}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterAddConstraint(gramaticaProyectoParser.AlterAddConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterAddConstraint}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterAddConstraint(gramaticaProyectoParser.AlterAddConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterDropColumn}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterDropColumn(gramaticaProyectoParser.AlterDropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterDropColumn}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterDropColumn(gramaticaProyectoParser.AlterDropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterDropConstraint}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterDropConstraint(gramaticaProyectoParser.AlterDropConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterDropConstraint}
	 * labeled alternative in {@link gramaticaProyectoParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterDropConstraint(gramaticaProyectoParser.AlterDropConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#idTable}.
	 * @param ctx the parse tree
	 */
	void enterIdTable(gramaticaProyectoParser.IdTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#idTable}.
	 * @param ctx the parse tree
	 */
	void exitIdTable(gramaticaProyectoParser.IdTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#idColumn}.
	 * @param ctx the parse tree
	 */
	void enterIdColumn(gramaticaProyectoParser.IdColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#idColumn}.
	 * @param ctx the parse tree
	 */
	void exitIdColumn(gramaticaProyectoParser.IdColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#idConstraint}.
	 * @param ctx the parse tree
	 */
	void enterIdConstraint(gramaticaProyectoParser.IdConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#idConstraint}.
	 * @param ctx the parse tree
	 */
	void exitIdConstraint(gramaticaProyectoParser.IdConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_statement(gramaticaProyectoParser.Drop_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_statement(gramaticaProyectoParser.Drop_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#alter_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_statement(gramaticaProyectoParser.Alter_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#alter_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_statement(gramaticaProyectoParser.Alter_database_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#show_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_schema_statement(gramaticaProyectoParser.Show_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#show_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_schema_statement(gramaticaProyectoParser.Show_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#use_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_schema_statement(gramaticaProyectoParser.Use_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#use_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_schema_statement(gramaticaProyectoParser.Use_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code column_literal}
	 * labeled alternative in {@link gramaticaProyectoParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn_literal(gramaticaProyectoParser.Column_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code column_literal}
	 * labeled alternative in {@link gramaticaProyectoParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn_literal(gramaticaProyectoParser.Column_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code column_constraint}
	 * labeled alternative in {@link gramaticaProyectoParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(gramaticaProyectoParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code column_constraint}
	 * labeled alternative in {@link gramaticaProyectoParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(gramaticaProyectoParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_lit_int}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void enterTipo_lit_int(gramaticaProyectoParser.Tipo_lit_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_lit_int}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void exitTipo_lit_int(gramaticaProyectoParser.Tipo_lit_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_lit_float}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void enterTipo_lit_float(gramaticaProyectoParser.Tipo_lit_floatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_lit_float}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void exitTipo_lit_float(gramaticaProyectoParser.Tipo_lit_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_lit_char}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void enterTipo_lit_char(gramaticaProyectoParser.Tipo_lit_charContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_lit_char}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void exitTipo_lit_char(gramaticaProyectoParser.Tipo_lit_charContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_lit_date}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void enterTipo_lit_date(gramaticaProyectoParser.Tipo_lit_dateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_lit_date}
	 * labeled alternative in {@link gramaticaProyectoParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void exitTipo_lit_date(gramaticaProyectoParser.Tipo_lit_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(gramaticaProyectoParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(gramaticaProyectoParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintTypePrimaryKey}
	 * labeled alternative in {@link gramaticaProyectoParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void enterConstraintTypePrimaryKey(gramaticaProyectoParser.ConstraintTypePrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintTypePrimaryKey}
	 * labeled alternative in {@link gramaticaProyectoParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void exitConstraintTypePrimaryKey(gramaticaProyectoParser.ConstraintTypePrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintTypeForeignKey}
	 * labeled alternative in {@link gramaticaProyectoParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void enterConstraintTypeForeignKey(gramaticaProyectoParser.ConstraintTypeForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintTypeForeignKey}
	 * labeled alternative in {@link gramaticaProyectoParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void exitConstraintTypeForeignKey(gramaticaProyectoParser.ConstraintTypeForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintTypeCheck}
	 * labeled alternative in {@link gramaticaProyectoParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void enterConstraintTypeCheck(gramaticaProyectoParser.ConstraintTypeCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintTypeCheck}
	 * labeled alternative in {@link gramaticaProyectoParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void exitConstraintTypeCheck(gramaticaProyectoParser.ConstraintTypeCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#idRef}.
	 * @param ctx the parse tree
	 */
	void enterIdRef(gramaticaProyectoParser.IdRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#idRef}.
	 * @param ctx the parse tree
	 */
	void exitIdRef(gramaticaProyectoParser.IdRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#localIDS}.
	 * @param ctx the parse tree
	 */
	void enterLocalIDS(gramaticaProyectoParser.LocalIDSContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#localIDS}.
	 * @param ctx the parse tree
	 */
	void exitLocalIDS(gramaticaProyectoParser.LocalIDSContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#refIDS}.
	 * @param ctx the parse tree
	 */
	void enterRefIDS(gramaticaProyectoParser.RefIDSContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#refIDS}.
	 * @param ctx the parse tree
	 */
	void exitRefIDS(gramaticaProyectoParser.RefIDSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_logic}
	 * labeled alternative in {@link gramaticaProyectoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_logic(gramaticaProyectoParser.Exp_logicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_logic}
	 * labeled alternative in {@link gramaticaProyectoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_logic(gramaticaProyectoParser.Exp_logicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_logic_not}
	 * labeled alternative in {@link gramaticaProyectoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_logic_not(gramaticaProyectoParser.Exp_logic_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_logic_not}
	 * labeled alternative in {@link gramaticaProyectoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_logic_not(gramaticaProyectoParser.Exp_logic_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_relational}
	 * labeled alternative in {@link gramaticaProyectoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_relational(gramaticaProyectoParser.Exp_relationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_relational}
	 * labeled alternative in {@link gramaticaProyectoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_relational(gramaticaProyectoParser.Exp_relationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterRename_table_statement(gramaticaProyectoParser.Rename_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitRename_table_statement(gramaticaProyectoParser.Rename_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#show_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_table_statement(gramaticaProyectoParser.Show_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#show_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_table_statement(gramaticaProyectoParser.Show_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#show_column_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_column_statement(gramaticaProyectoParser.Show_column_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#show_column_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_column_statement(gramaticaProyectoParser.Show_column_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logic_and}
	 * labeled alternative in {@link gramaticaProyectoParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic_and(gramaticaProyectoParser.Logic_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logic_and}
	 * labeled alternative in {@link gramaticaProyectoParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic_and(gramaticaProyectoParser.Logic_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logic_or}
	 * labeled alternative in {@link gramaticaProyectoParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic_or(gramaticaProyectoParser.Logic_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logic_or}
	 * labeled alternative in {@link gramaticaProyectoParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic_or(gramaticaProyectoParser.Logic_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#logic_not}.
	 * @param ctx the parse tree
	 */
	void enterLogic_not(gramaticaProyectoParser.Logic_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#logic_not}.
	 * @param ctx the parse tree
	 */
	void exitLogic_not(gramaticaProyectoParser.Logic_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(gramaticaProyectoParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(gramaticaProyectoParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_value(gramaticaProyectoParser.Insert_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_value(gramaticaProyectoParser.Insert_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#update_value}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_value(gramaticaProyectoParser.Update_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#update_value}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_value(gramaticaProyectoParser.Update_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(gramaticaProyectoParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(gramaticaProyectoParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#delete_value}.
	 * @param ctx the parse tree
	 */
	void enterDelete_value(gramaticaProyectoParser.Delete_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#delete_value}.
	 * @param ctx the parse tree
	 */
	void exitDelete_value(gramaticaProyectoParser.Delete_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#select_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_value(gramaticaProyectoParser.Select_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#select_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_value(gramaticaProyectoParser.Select_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#nID}.
	 * @param ctx the parse tree
	 */
	void enterNID(gramaticaProyectoParser.NIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#nID}.
	 * @param ctx the parse tree
	 */
	void exitNID(gramaticaProyectoParser.NIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#nlocalIDS}.
	 * @param ctx the parse tree
	 */
	void enterNlocalIDS(gramaticaProyectoParser.NlocalIDSContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#nlocalIDS}.
	 * @param ctx the parse tree
	 */
	void exitNlocalIDS(gramaticaProyectoParser.NlocalIDSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orderUni}
	 * labeled alternative in {@link gramaticaProyectoParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrderUni(gramaticaProyectoParser.OrderUniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orderUni}
	 * labeled alternative in {@link gramaticaProyectoParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrderUni(gramaticaProyectoParser.OrderUniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orderMulti}
	 * labeled alternative in {@link gramaticaProyectoParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrderMulti(gramaticaProyectoParser.OrderMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orderMulti}
	 * labeled alternative in {@link gramaticaProyectoParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrderMulti(gramaticaProyectoParser.OrderMultiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionCond}
	 * labeled alternative in {@link gramaticaProyectoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionCond(gramaticaProyectoParser.ConditionCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionCond}
	 * labeled alternative in {@link gramaticaProyectoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionCond(gramaticaProyectoParser.ConditionCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionComp}
	 * labeled alternative in {@link gramaticaProyectoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionComp(gramaticaProyectoParser.ConditionCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionComp}
	 * labeled alternative in {@link gramaticaProyectoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionComp(gramaticaProyectoParser.ConditionCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionNot}
	 * labeled alternative in {@link gramaticaProyectoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionNot(gramaticaProyectoParser.ConditionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionNot}
	 * labeled alternative in {@link gramaticaProyectoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionNot(gramaticaProyectoParser.ConditionNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compId}
	 * labeled alternative in {@link gramaticaProyectoParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterCompId(gramaticaProyectoParser.CompIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compId}
	 * labeled alternative in {@link gramaticaProyectoParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitCompId(gramaticaProyectoParser.CompIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compLitId}
	 * labeled alternative in {@link gramaticaProyectoParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterCompLitId(gramaticaProyectoParser.CompLitIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compLitId}
	 * labeled alternative in {@link gramaticaProyectoParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitCompLitId(gramaticaProyectoParser.CompLitIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compLit}
	 * labeled alternative in {@link gramaticaProyectoParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterCompLit(gramaticaProyectoParser.CompLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compLit}
	 * labeled alternative in {@link gramaticaProyectoParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitCompLit(gramaticaProyectoParser.CompLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(gramaticaProyectoParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(gramaticaProyectoParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumna(gramaticaProyectoParser.ColumnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumna(gramaticaProyectoParser.ColumnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(gramaticaProyectoParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(gramaticaProyectoParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(gramaticaProyectoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(gramaticaProyectoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(gramaticaProyectoParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(gramaticaProyectoParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat_literal(gramaticaProyectoParser.Float_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat_literal(gramaticaProyectoParser.Float_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(gramaticaProyectoParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(gramaticaProyectoParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaProyectoParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(gramaticaProyectoParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaProyectoParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(gramaticaProyectoParser.Char_literalContext ctx);
}