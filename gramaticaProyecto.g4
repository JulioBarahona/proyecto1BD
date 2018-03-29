grammar gramaticaProyecto;
// Julio Barahona
// Tomando como referencia el sigueinte link: https://tomassetti.me/antlr-mega-tutorial/
/*
 * Definiciones de Lexer
 * da las varibales
 */

//letras individuales definidas para ser  reconocidas tanto en minuscula como mayuscula
fragment A:('A'|'a');
fragment B:('B'|'b');
fragment C:('C'|'c');
fragment D:('D'|'d');
fragment E:('E'|'e');
fragment F:('F'|'f');
fragment G:('G'|'g');
fragment H:('H'|'h');
fragment I:('I'|'i');
fragment J:('J'|'j');
fragment K:('K'|'k');
fragment L:('L'|'l');
fragment M:('M'|'m');
fragment N:('N'|'n');
fragment O:('O'|'o');
fragment P:('P'|'p');
fragment Q:('Q'|'q');
fragment R:('R'|'r');
fragment S:('S'|'s');
fragment T:('T'|'t');
fragment U:('U'|'u');
fragment V:('V'|'v');
fragment W:('W'|'w');
fragment X:('X'|'x');
fragment Y:('Y'|'y');
fragment Z:('Z'|'z');

//PARTE 1
//comandos para crud de bases de datos, tablas y datos usando el orden correcto pero indiferente ante minusculas o mayusculas
//i
CREATE : C R E A T E;
DATABASE : D A T A B A S E;

//ii
ALTER : A L T E R;
RENAME : R E N A M E;
TO : T O;

//iii
DROP : D R O P;

//iv
SHOW : S H O W;
DATABASES : D A T A B A S E S;

//v
USE : U S E;

//vi (1)
TABLE : T A B L E;
REFERENCES : R E F E R E N C E S;

//vi (2)
PRIMARY : P R I M A R Y;
KEY : K E Y;
FOREIGN : F O R E I G N;
CHECK : C H E C K;

//vi (3)
RES_INT : I N T;
RES_FLOAT : F L O A T;
RES_CHAR : C H A R;
RES_DATE : D A T E;

//vi (4)
RES_AND : A N D;
RES_OR : O R;
RES_NOT : N O T;
//pendiete como hacer < , <= , > , >= , <> , =
//probablemente en java ¯\_(ツ)_/¯
//se logró en parser V,: AIUDAAAAA!

//vii ya estan todas definidas antes

//viii (1a)
ADD : A D D;
COLUMN : C O L U M N;
CONSTRAINT : C O N S T R A I N T;

//viii (1b) ya estan todas definidas antes
//viii (1c) ya estan todas definidas antes
//viii (1d)ya estan todas definidas antes

//ix ya estan todas definidas antes
//x
TABLES : T A B L E S;

//xi
COLUMNS : C O L U M N S;


//PARTE 2
//i (1)
INTO : I N T O;
INSERT : I N S E R T;
VALUES : V A L U E S;

//i (2)
NULL: N U L L;

//ii
UPDATE : U P D A T E;
SET : S E T;
WHERE : W H E R E;

//iii
DELETE : D E L E T E;

//iv
SELECT : S E L E C T;
FROM : F R O M;
ORDER : O R D E R;
BY : B Y;
ASC: A S C;
DESC: D E S C;


//posibles combinaciones de nombres
fragment LETTER : ('a'..'z'|'A'..'Z') ;
fragment DIGIT :'0'..'9' ;

//caracteres especiales
fragment ASCII : (' '..'&')('('..'~')| DIGIT | LETTER  | '\\' |'\"' | '\t' | '\n' | '.';

//secuencuas de numeros aceptados
fragment TWO_DIGITS : DIGIT DIGIT ;
fragment THREE_DIGITS : DIGIT TWO_DIGITS ;
fragment FOUR_DIGITS : DIGIT THREE_DIGITS ;

//formato de los elementos en fechas
fragment YEAR : FOUR_DIGITS ;
fragment MONTH : (DIGIT | TWO_DIGITS) ;
fragment DAY : (DIGIT | TWO_DIGITS) ;

//definicion de diferentes tipos    de variables
ID : LETTER ( LETTER | DIGIT )* ;
INT: DIGIT ( DIGIT )*;
DATE: '\'' YEAR'-'MONTH'-'DAY  '\'';
CHAR : '\'' ASCII(ASCII)* '\'' ;

//caracteres a ignorar en el stream ya que no son ni reservados ni utiles
WHITESPACE : [\t\r\n\f ]+ -> skip ;
COMMENT : ( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/' ) -> skip ;



/*
 * Definiciones de Parser
 * usa las variables...(de alguna forma) leer linea 3
 */
//
sql2003Parser : ( sql_executable_statement )+ ;

sql_executable_statement : sql_schema_statement | sql_data_statement ;

sql_schema_statement : sql_schema_definition_statement | sql_schema_manipulation_statement ;

sql_schema_definition_statement : schema_definition | table_definition ;

sql_schema_manipulation_statement : 	drop_schema_statement   |   alter_table_statement    |
	                                    drop_table_statement    |   alter_database_statement|
	                                    use_schema_statement    |   show_schema_statement|
	                                    rename_table_statement  |   show_table_statement|
	                                    show_column_statement ;

sql_data_statement :    select_value    |   insert_value    |
                        delete_value    |   update_value;

schema_definition: CREATE DATABASE ID ';' ;

table_definition: CREATE TABLE ID '(' column (',' column)* ')' ';' ;

drop_schema_statement: DROP DATABASE ID ';' ;

alter_table_statement: ALTER TABLE idTable ADD COLUMN idColumn tipo_literal (constraint)? ';' #alterAddColumn
					 | ALTER TABLE idTable ADD constraint ';' #alterAddConstraint
					 | ALTER TABLE idTable DROP COLUMN idColumn ';' #alterDropColumn
					 | ALTER TABLE idTable DROP CONSTRAINT idConstraint ';' #alterDropConstraint;
idTable: ID;

idColumn: ID;

idConstraint: ID;

drop_table_statement: DROP TABLE ID ';' ;

alter_database_statement: ALTER DATABASE ID RENAME TO ID ';' ;

show_schema_statement: SHOW DATABASES ';' ;

use_schema_statement: USE DATABASE ID ';' ;

column: ID tipo_literal #column_literal
		| constraint #column_constraint;

tipo_literal: RES_INT #tipo_lit_int
			| RES_FLOAT #tipo_lit_float
			| (RES_CHAR '('INT ')') #tipo_lit_char
			| RES_DATE #tipo_lit_date;
constraint: CONSTRAINT constraintType ;
constraintType:
            ID PRIMARY KEY '(' localIDS ')' #constraintTypePrimaryKey
        |   ID FOREIGN KEY  '(' localIDS ')' REFERENCES idRef '(' refIDS ')' #constraintTypeForeignKey
        |   ID CHECK '('condition ')' #constraintTypeCheck;
idRef: ID;
localIDS: ID
		  | ID ',' localIDS;
refIDS: ID
		| ID ',' refIDS;
exp: logic #exp_logic
	 | logic_not #exp_logic_not
	 | relational #exp_relational;
rename_table_statement: ALTER TABLE ID RENAME TO ID ';' ;
show_table_statement: SHOW TABLES ';' ;
show_column_statement: SHOW COLUMNS FROM ID ';' ;
logic: RES_AND #logic_and
	   | RES_OR #logic_or;
logic_not: RES_NOT;
relational: '<' | '<=' | '>' | '>=' | '<>' | '=' ;
insert_value: INSERT INTO ID (columns)? VALUES list ';' ;
update_value: UPDATE ID SET asignacion (WHERE condition)? ';' ;
asignacion : columna '=' literal (',' columna '=' literal)*;
delete_value: DELETE FROM ID (WHERE condition)? ';' ;
select_value: SELECT ('*' | nlocalIDS ) FROM localIDS (WHERE condition)?  ( ORDER BY order )? ';' ;
nID: ID
	|ID '.' ID;
nlocalIDS: nID
		  | nID ',' nlocalIDS;
order: nID ( ASC | DESC )? #orderUni
	| nID (ASC | DESC )? ',' order #orderMulti;
condition: '(' condition ')' (logic condition)? #conditionCond
                 | comp (logic condition)? #conditionComp
                 | logic_not condition #conditionNot;
comp : nID relational (nID | literal) #compId
	   | literal relational nID #compLitId
	   | literal relational literal #compLit;
columns: (columna ( ',' columna)* | ('(' columna (','columna)* ')')) ;
columna: ID;
list : (literal (',' literal)* )
			|  '(' (literal (',' literal)* ) ')';
literal:
        int_literal
    |   float_literal
    |   date_literal
    |   char_literal
    |   NULL ;

//numero con negativo opcional
int_literal: ('-')? INT;

//float usa a veces negatios y a veces punto pero si numeros en medio de signo y punto y
float_literal: ('-')? INT ('.' INT )?;

//usa le fecha definida
date_literal: DATE ;

//letras y palanras definidas
char_literal: CHAR;
