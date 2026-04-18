grammar game;

// ==========================
// Parser
// ==========================

program : line* EOF ;

line 
    : create
    | move
    | limits
    ;

// Criar objetos
create 
    : MAN value ',' value
    | HOUSE value ',' value
    | CASTLE value ',' value
    ;

// Movimento por índice
move
    : MOV INT ',' eixo ',' value
    ;

// Limites por índice
limits
    : LIMITS INT ',' value ',' value ',' value ',' value
    ;

// eixo
eixo : X | Y ;

// valores
value 
    : INT
    | FLOAT
    ;

// ==========================
// Lexer
// ==========================

MAN     : 'MAN';
HOUSE   : 'HOUSE';
CASTLE  : 'CASTLE';

MOV     : 'MOV';
LIMITS  : 'LIMITS';

X : 'X';
Y : 'Y';

FLOAT : DIGIT+ '.' DIGIT+ ;
INT   : DIGIT+ ;

fragment DIGIT : [0-9];

WS : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;