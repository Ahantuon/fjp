lexer grammar FJPLexer;

// klicova slova
CONST:          'const';
INT:            'int';
BOOLEAN:        'boolean';
PROCEDURE:      'procedure';
START:          'start';
END:            'end';
CALL:           'call';
MAIN:           'main';
WHILE:          'while';


// separatory
LPAREN:         '(';
RPAREN:         ')';
SEMI:           ';';
COMMA:          ',';


// hodnoty a nazvy
INT_VALUE:      [0-9]+;
BOOLEAN_VALUE:  'true' | 'false';
ID:             [a-zA-Z]+;

// operatory
ASSIGN:         ':=';
GT:             '>';
LT:             '<';
LE:             '<=';
GE:             '>=';
EQUAL:          '=';
NOT_EQUAL:      '!=';
NEG:            '!';
AND:            'and';
OR:             'or';
ADD:            '+';
SUB:            '-';
MUL:            '*';
DIV:            '/';


// bile mezery
WS:             [ \t\r\n] -> skip;