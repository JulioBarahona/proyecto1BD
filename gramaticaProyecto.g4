grammar gramaticaProyecto;

/*
 * Definiciones de Lexer
 */

//letras individuales que son reconocidas tanto en minuscula como mayuscula
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

//comandos para crud de bases de datos, tablas y datos
CREATE : C R E A T E;
DATABASE : D A T A B A S E;
DATABASES : D A T A B A S E S;
TABLE : T A B L E;
TABLES : T A B L E S;
DROP : D R O P;
ALTER : A L T E R;
RENAME : R E N A M E;
TO : T O;
SHOW : S H O W;
USE : U S E;
RES_INT : I N T;
RES_FLOAT : F L O A T;
RES_CHAR : C H A R;
RES_DATE : D A T E;
CONSTRAINT : C O N S T R A I N T;
KEY : K E Y;
PRIMARY : P R I M A R Y;
FOREIGN : F O R E I G N;
REFERENCES : R E F E R E N C E S;
CHECK : C H E C K;
ADD : A D D;
COLUMN : C O L U M N;
COLUMNS : C O L U M N S;
FROM : F R O M;
RES_AND : A N D;
RES_OR : O R;
RES_NOT : N O T;
INSERT : I N S E R T;
INTO : I N T O;
VALUES : V A L U E S;
UPDATE : U P D A T E;
SET : S E T;
WHERE : W H E R E;
DELETE : D E L E T E;
SELECT : S E L E C T;
ORDER : O R D E R;
BY : B Y;
ASC: A S C;
DESC: D E S C;
NULL: N U L L;

//posibles combinaciones de nombres
fragment LETTER : ('a'..'z'|'A'..'Z') ;
fragment DIGIT :'0'..'9' ;
fragment ASCII : (' '..'&')('('..'~')| DIGIT | LETTER  | '\\' |'\"' | '\t' | '\n' | '.';
fragment TWO_DIGITS : DIGIT DIGIT ;
fragment THREE_DIGITS : DIGIT TWO_DIGITS ;
fragment FOUR_DIGITS : DIGIT THREE_DIGITS ;
fragment YEAR : FOUR_DIGITS ;
fragment MONTH : DIGIT | TWO_DIGITS ;

fragment DAY : DIGIT | TWO_DIGITS ;

INT: DIGIT ( DIGIT )*;
ID : LETTER ( LETTER | DIGIT )* ;
DATE: '\'' YEAR'-'MONTH'-'DAY  '\'';
CHAR : '\'' ASCII(ASCII)* '\'' ;

WHITESPACE : [\t\r\n\f ]+ -> skip ;

COMMENT : ( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/' ) -> skip ;
