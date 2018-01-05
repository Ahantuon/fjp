grammar FJP;

program
   : (constantDefinitionPart |  variableDeclarationPart | procedureAndFunctionDeclarationPart)* programHeading compoundStatement;

programHeading
   : START PROGRAM
   ;

identifier
   : IDENT
   ;

block
   : (constantDefinitionPart |  variableDeclarationPart | procedureAndFunctionDeclarationPart)* compoundStatement
   ;





constantDefinitionPart
   : CONST (constantDefinition SEMI)+
   ;

constantDefinition
   : identifier EQUAL constant
   ;



constant
   : unsignedNumber
   | sign unsignedNumber
   | identifier
   | sign identifier
   ;

unsignedNumber
   : unsignedInteger
   | unsignedReal
   ;

unsignedInteger
   : NUM_INT
   ;

unsignedReal
   : NUM_INT
   ;

sign
   : PLUS
   | MINUS
   ;

string
   : STRING_LITERAL
   ;


typeDefinition
   : identifier EQUAL (type | functionType | procedureType)
   ;

functionType
   : FUNCTION (formalParameterList)? COLON resultType
   ;

procedureType
   : PROCEDURE (formalParameterList)?
   ;

type
   : simpleType
   ;

simpleType
   : scalarType
   | typeIdentifier
   ;

scalarType
   : LPAREN identifierList RPAREN
   ;



typeIdentifier
   : identifier
   | (BOOLEAN | INTEGER)
   ;


typeList
   : indexType (COMMA indexType)*
   ;

indexType
   : simpleType
   ;

componentType
   : type
   ;



fieldList
   : fixedPart (SEMI variantPart)?
   | variantPart
   ;

fixedPart
   : recordSection (SEMI recordSection)*
   ;

recordSection
   : identifierList COLON type
   ;

variantPart
   : CASE tag OF variant (SEMI variant)*
   ;

tag
   : identifier COLON typeIdentifier
   | typeIdentifier
   ;

variant
   : constList COLON LPAREN fieldList RPAREN
   ;


baseType
   : simpleType
   ;


variableDeclarationPart
   : VAR variableDeclaration (SEMI variableDeclaration)* SEMI
   ;

variableDeclaration
   : identifierList COLON type
   ;

procedureAndFunctionDeclarationPart
   : procedureOrFunctionDeclaration SEMI
   ;

procedureOrFunctionDeclaration
   : procedureDeclaration
   | functionDeclaration
   ;

procedureDeclaration
   : PROCEDURE identifier (formalParameterList)? SEMI block
   ;

formalParameterList
   : LPAREN formalParameterSection (SEMI formalParameterSection)* RPAREN
   ;

formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | FUNCTION parameterGroup
   | PROCEDURE parameterGroup
   ;

parameterGroup
   : identifierList COLON typeIdentifier
   ;

identifierList
   : identifier (COMMA identifier)*
   ;

constList
   : constant (COMMA constant)*
   ;

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON resultType SEMI block
   ;

resultType
   : typeIdentifier
   ;

statement
   : unlabelledStatement
   ;

unlabelledStatement
   : simpleStatement
   | structuredStatement
   ;

simpleStatement
   : assignmentStatement
   | procedureStatement
   | emptyStatement
   ;

assignmentStatement
   : variable ASSIGN expression
   ;

variable
   : identifier
   ;

expression
   : simpleExpression ((EQUAL | NOT_EQUAL | LT | LE | GE | GT | IN) simpleExpression)*
   ;

simpleExpression
   : term ((PLUS | MINUS | OR) term)*
   ;

term
   : signedFactor ((STAR | SLASH | DIV | MOD | AND) signedFactor)*
   ;

signedFactor
   : (PLUS | MINUS)? factor
   ;

factor
   : variable
   | LPAREN expression RPAREN
   | functionDesignator
   | unsignedConstant
   | NOT factor
   ;

unsignedConstant
   : unsignedNumber
   | NIL
   ;

functionDesignator
   : identifier LPAREN parameterList RPAREN
   ;

parameterList
   : actualParameter (COMMA actualParameter)*
   ;



procedureStatement
   : identifier (LPAREN parameterList RPAREN)?
   ;

actualParameter
   : expression
   ;



emptyStatement
   :
   ;

empty
   :/* empty */
   ;

structuredStatement
   : compoundStatement
   | conditionalStatement
   | repetetiveStatement
   | withStatement
   ;

compoundStatement
   : BEGIN statements END
   ;

statements
   : statement (SEMI statement)*
   ;

conditionalStatement
   : ifStatement
   | caseStatement
   ;

ifStatement
   : IF expression THEN statement (: ELSE statement)?
   ;

caseStatement
   : CASE expression OF caseListElement (SEMI caseListElement)* (SEMI ELSE statements)? END
   ;

caseListElement
   : constList COLON statement
   ;

repetetiveStatement
   : whileStatement
   | forStatement
   ;

whileStatement
   : WHILE expression DO statement
   ;


forStatement
   : FOR identifier ASSIGN forList DO statement
   ;

forList
   : initialValue (TO | DOWNTO) finalValue
   ;

initialValue
   : expression
   ;

finalValue
   : expression
   ;

withStatement
   : WITH recordVariableList DO statement
   ;

recordVariableList
   : variable (COMMA variable)*
   ;



AND
   : ('and' | 'AND')
   ;


BEGIN
   : ('begin' | 'BEGIN')
   ;


BOOLEAN
   : ('boolean' | 'BOOLEAN')
   ;


CASE
   : ('case' | 'CASE')
   ;


CONST
   : ('const' | 'CONST')
   ;


DIV
   : ('div' | 'DIV')
   ;


DO
   : ('do' | 'DO')
   ;


DOWNTO
   : ('downto' | 'DOWNTO')
   ;


ELSE
   : ('else' | 'ELSE')
   ;


END
   : ('end' | 'END')
   ;



FOR
   : ('for' | 'FOR')
   ;


FUNCTION
   : ('function' | 'FUNCTION')
   ;


IF
   : ('if' | 'IF')
   ;


IN
   : ('in' | 'IN')
   ;


INTEGER
   : ('integer' | 'INTEGER')
   ;




MOD
   : ('mod' | 'MOD')
   ;


NIL
   : ('null' | 'NULL')
   ;


NOT
   : ('not' | 'NOT')
   ;


OF
   : ('of' | 'OF')
   ;


OR
   : ('or' | 'OR')
   ;




PROCEDURE
   : ('procedure' | 'PROCEDURE')
   ;


PROGRAM
   : ('program' | 'PROGRAM')
   ;

START
    : ('start' | 'START')
    ;









THEN
   : ('then' | 'THEN')
   ;


TO
   : ('to' | 'TO')
   ;








VAR
   : ('var' | 'VAR')
   ;


WHILE
   : ('while' | 'WHILE')
   ;


WITH
   : ('with' | 'WITH')
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


STAR
   : '*'
   ;


SLASH
   : '/'
   ;


ASSIGN
   : ':='
   ;


COMMA
   : ','
   ;


SEMI
   : ';'
   ;


COLON
   : ':'
   ;


EQUAL
   : '='
   ;


NOT_EQUAL
   : '<>'
   ;


LT
   : '<'
   ;


LE
   : '<='
   ;


GE
   : '>='
   ;


GT
   : '>'
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;




WS
   : [ \t\r\n] -> skip
   ;



COMMENT_1
    :   '/*' .*? '*/'
        -> skip
    ;

COMMENT_2
    :   '//' ~[\r\n]*
        -> skip
    ;


IDENT
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;


STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;


NUM_INT
   : ('+' | '-')? ('0' .. '9') +
   ;