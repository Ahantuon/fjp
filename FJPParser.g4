parser grammar FJPParser;

options { tokenVocab=FJPLexer; }

program     : START constant* global* procedure* main END;

constant    : CONST ID ASSIGN INT_VALUE SEMI;
global      : int_var | boolean_var;
procedure   : PROCEDURE ID LPAREN argument (COMMA argument)* RPAREN body;

int_var     : INT ID (ASSIGN INT_VALUE)? SEMI;
boolean_var : BOOLEAN ID (ASSIGN BOOLEAN_VALUE)? SEMI;

argument    : INT ID | BOOLEAN ID;
body        : START statement* END;
statement   : call
            | while_cycle
            | assigment;

call        : CALL ID LPAREN var (COMMA var)* RPAREN SEMI;
while_cycle : WHILE LPAREN expression RPAREN START statement* END;
assigment   : ID ASSIGN (var | expression) SEMI;

var         : INT_VALUE | BOOLEAN_VALUE | ID;
expression  : simpleExp ((EQUAL | NOT_EQUAL | LT | LE | GE | GT) simpleExp)*;
simpleExp   : term ((AND | OR) term)*;
term        : var ((ADD | SUB | MUL | DIV) var)*;

main        : MAIN body;

