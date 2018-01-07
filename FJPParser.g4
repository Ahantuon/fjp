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
            | do_while
            | if_else;

call        : CALL ID LPAREN var (COMMA var)* RPAREN SEMI;
do_while    : DO START (call | assigment)* END WHILE LPAREN expression RPAREN;
if_else     : IF LPAREN expression RPAREN START (call | assigment | do_while)* END else_part START (call | assigment | do_while)* END;
else_part   : ELSE;
assigment   : ID ASSIGN (var | expression) SEMI;

var         : value | ids;
value       : INT_VALUE | BOOLEAN_VALUE;
ids         : ID;
expression  : simpleExp ((EQUAL | NOT_EQUAL | LT | LE | GE | GT) simpleExp)*;
simpleExp   : term ((ADD | SUB | OR) term)*;
term        : var ((AND | MUL | DIV) var)*;

main        : MAIN body;

