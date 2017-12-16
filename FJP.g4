grammar FJP;
S  : 'start' PROGRAM 'end' ;
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
    VARIABLE_NAME ':=' VALUE ';'
;

VARIABLE_NAME
:
[ \t\r\n]+ -> skip
;

VALUE
:
[ \t\r\n]+ -> skip
;

FUNCTIONS
:
	MAIN
	| FUNCTION FUNCTIONS
;

FUNCTION
:
    [ \t\r\n]+ -> skip
;

MAIN
:
    [ \t\r\n]+ -> skip

;