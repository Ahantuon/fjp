grammar FJP;
r
:
    'start' PROGRAM 'end'
;

PROGRAM
:
   VARIABLES
;

VARIABLES
:
    FUNCTIONS
    | VARIABLE VARIABLES
;

VARIABLE
:
    VARIABLE_NAME ';'
    | VARIABLE_NAME ':=' VALUE ';'
;

VARIABLE_NAME
:
    [a-z]+
;

VALUE
:
    [a-z]+
;

FUNCTIONS
:
	MAIN
	| FUNCTION FUNCTIONS
;

FUNCTION
:
    [a-z]+
;

MAIN
:
    [a-z]+
;

WS
:
    [ \t\r\n]+ -> skip
;