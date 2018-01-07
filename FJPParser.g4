parser grammar FJPParser;

options { tokenVocab=FJPLexer; }

program     : START constant* globals procedure* main END;

constant    : CONST ID ASSIGN INT_VALUE SEMI;
globals     : variable*;
procedure   : PROCEDURE ID LPAREN arguments RPAREN body;

int_var     : INT ID (ASSIGN INT_VALUE)? SEMI;
boolean_var : BOOLEAN ID (ASSIGN BOOLEAN_VALUE)? SEMI;

arguments   : argument (COMMA argument)*;
argument    : INT ID | BOOLEAN ID;
body        : START locales statement* END;
locales     : variable*;
variable    : int_var | boolean_var;
statement   : call
            | assigment
            | assigment_p
            | re_until
            | do_while
            | while_do
            | if_else;

call        : CALL ID LPAREN var (COMMA var)* RPAREN SEMI;
re_until    : REPEAT START (call | assigment | assigment_p)* END UNTIL LPAREN expression RPAREN;
do_while    : DO START (call | assigment | assigment_p)* END WHILE LPAREN expression RPAREN;
while_do    : WHILE LPAREN expression RPAREN start_do (call | assigment | assigment_p)* END;
start_do    : START;
if_else     : IF LPAREN expression RPAREN START (call | assigment | assigment_p | re_until | while_do | do_while)* END else_part START (call | assigment | assigment_p | re_until | while_do | do_while)* END;
else_part   : ELSE;
assigment   : ID (COMMA ID)* ASSIGN (var | expression) SEMI;
assigment_p : LBRACK ID (COMMA ID)* RBRACK ASSIGN LBRACK (var | expression)(COMMA (var | expression))* RBRACK SEMI;

var         : NEG? LPAREN expression RPAREN | value | ids;
value       : INT_VALUE | BOOLEAN_VALUE;
ids         : ID;
expression  : simpleExp ((EQUAL | NOT_EQUAL | LT | LE | GE | GT) simpleExp)*;
simpleExp   : term ((ADD | SUB | OR) term)*;
term        : var ((AND | MUL | DIV) var)*;

main        : MAIN body;

