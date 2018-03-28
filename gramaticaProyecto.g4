grammar gramaticaProyecto;

/*
 * Definiciones de Lexer
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

//caracteres a ignorar en el stream
WHITESPACE : [\t\r\n\f ]+ -> skip ;
COMMENT : ( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/' ) -> skip ;
