grammar Hash;

// Parser Rules
program
    : packageDecl? importDecl* topLevelDecl* EOF
    ;

packageDecl
    : BASTE qualifiedName SEMI
    ;

importDecl
    : BIAR qualifiedName (DOT STAR)? SEMI
    ;

qualifiedName
    : namePart (DOT namePart)*
    ;

namePart
    : ID
    | CLASS_ID
    ;

topLevelDecl
    : classDecl
    | functionDecl
    | varDecl
    ;

// Types
typeName
    : primitiveType
    | CLASS_ID
    ;

returnType
    : primitiveType
    | HICH
    | CLASS_ID
    ;

primitiveType
    : ADAD
    | ASHARI
    | BOOLE
    | MATN
    | HARF
    ;

// Declarations
varDecl
    : typeName ID (ASSIGN expr)? SEMI
    ;

varDeclNoSemi
    : typeName ID (ASSIGN expr)?
    ;

functionDecl
    : BEBIN returnType ID LPAREN paramList? RPAREN block
    ;

constructorDecl
    : BEBIN CLASS_ID LPAREN paramList? RPAREN block
    ;

paramList
    : param (COMMA param)*
    ;

param
    : typeName ID
    ;

classDecl
    : KLASS CLASS_ID LBRACE classMember* RBRACE
    ;

classMember
    : varDecl
    | functionDecl
    | constructorDecl
    ;

// Blocks and Statements
block
    : LBRACE statement* RBRACE
    ;

statement
    : block
    | varDecl
    | assignmentStmt
    | ifStmt
    | whileStmt
    | forStmt
    | switchStmt
    | tryStmt
    | returnStmt
    | breakStmt
    | continueStmt
    | printStmt
    | inputStmt
    | throwStmt
    | exprStmt
    ;

assignmentStmt
    : assignment SEMI
    ;

assignment
    : lvalue assignOp expr
    ;

lvalue
    : (IN DOT)? ID (DOT ID)*
    ;

assignOp
    : ASSIGN
    | PLUS_ASSIGN
    | MINUS_ASSIGN
    | MUL_ASSIGN
    | DIV_ASSIGN
    ;

ifStmt
    : AGE LPAREN expr RPAREN BOOD block (VAGARNA block)?
    ;

whileStmt
    : TA LPAREN expr RPAREN block
    ;

forStmt
    : BARAYE LPAREN forInit? SEMI expr? SEMI forUpdate? RPAREN block
    ;

forInit
    : varDeclNoSemi
    | assignment
    | incDecExpr
    ;

forUpdate
    : assignment
    | incDecExpr
    ;

switchStmt
    : ENTEKHAB LPAREN expr RPAREN LBRACE caseBlock* defaultBlock? RBRACE
    ;

caseBlock
    : HALAT expr block
    ;

defaultBlock
    : DIGAR block
    ;

tryStmt
    : EMTEHAN block catchClause+ finallyClause?
    | EMTEHAN block finallyClause
    ;

catchClause
    : GEREFTAR LPAREN exceptionType ID RPAREN block
    ;

finallyClause
    : AKHAR block
    ;

returnStmt
    : BEDE expr? SEMI
    ;

breakStmt
    : SHEKAN SEMI
    ;

continueStmt
    : EDAME SEMI
    ;

printStmt
    : BECHAP LPAREN expr RPAREN SEMI
    ;

inputStmt
    : BEKHAN LPAREN primitiveType ID RPAREN SEMI
    ;

throwStmt
    : BENDAZ throwTarget SEMI
    ;

throwTarget
    : exceptionCreation
    | ID
    ;

exprStmt
    : expr SEMI
    ;

// Exceptions and Objects
exceptionType
    : SEFR_BOOD
    | MAHDOODE_NADOROST
    | JADVAL_KHALI
    | GHEIRE_MOJAZ
    | CLASS_ID
    ;

exceptionCreation
    : exceptionType LPAREN argumentList? RPAREN
    ;

objectCreation
    : JADID CLASS_ID LPAREN argumentList? RPAREN
    ;

argumentList
    : expr (COMMA expr)*
    ;

// Expressions
expr
    : logicalOrExpr
    ;

logicalOrExpr
    : logicalAndExpr (OR logicalAndExpr)*
    ;

logicalAndExpr
    : equalityExpr (AND equalityExpr)*
    ;

equalityExpr
    : relationalExpr ((EQ | NEQ) relationalExpr)*
    ;

relationalExpr
    : additiveExpr ((GT | GTE | LT | LTE) additiveExpr)*
    ;

additiveExpr
    : multiplicativeExpr ((PLUS | MINUS) multiplicativeExpr)*
    ;

multiplicativeExpr
    : powerExpr ((STAR | DIV | MOD) powerExpr)*
    ;

powerExpr
    : unaryExpr (POWER powerExpr)?
    ;

unaryExpr
    : (NOT | PLUS | MINUS | PLUS_PLUS | MINUS_MINUS) unaryExpr
    | postfixExpr
    ;

postfixExpr
    : primaryExpr postfixPart* postfixIncDec?
    ;

postfixPart
    : DOT ID
    | LPAREN argumentList? RPAREN
    ;

postfixIncDec
    : PLUS_PLUS
    | MINUS_MINUS
    ;

incDecExpr
    : lvalue postfixIncDec
    | (PLUS_PLUS | MINUS_MINUS) lvalue
    ;

primaryExpr
    : literal
    | ID
    | IN
    | objectCreation
    | exceptionCreation
    | LPAREN expr RPAREN
    ;

literal
    : INT
    | FLOAT
    | STRING
    | CHAR
    | DOROST
    | GHALAT
    | KHALI
    ;

// Lexer Rules
BASTE      : 'baste';
BIAR       : 'biar';
KLASS      : 'klass';
IN         : 'in';
JADID      : 'jadid';
BEBIN      : 'bebin';
BEDE       : 'bede';

ADAD       : 'adad';
ASHARI     : 'ashari';
BOOLE      : 'boole';
MATN       : 'matn';
HARF       : 'harf';
HICH       : 'hich';
KHALI      : 'khali';

DOROST     : 'dorost';
GHALAT     : 'ghalat';

AGE        : 'age';
BOOD       : 'bood';
VAGARNA    : 'vagarna';

TA         : 'ta';
BARAYE     : 'baraye';
SHEKAN     : 'shekan';
EDAME      : 'edame';

ENTEKHAB   : 'entekhab';
HALAT      : 'halat';
DIGAR      : 'digar';

EMTEHAN    : 'emtehan';
GEREFTAR   : 'gereftar';
AKHAR      : 'akhar';
BENDAZ     : 'bendaz';

BECHAP     : 'bechap';
BEKHAN     : 'bekhan';

SEFR_BOOD          : 'SefrBood';
MAHDOODE_NADOROST  : 'MahdoodeNadorost';
JADVAL_KHALI       : 'JadvalKhali';
GHEIRE_MOJAZ       : 'GheireMojaz';

PLUS_ASSIGN  : '+=';
MINUS_ASSIGN : '-=';
MUL_ASSIGN   : '*=';
DIV_ASSIGN   : '/=';

PLUS_PLUS    : '++';
MINUS_MINUS  : '--';
POWER        : '**';

EQ           : '==';
NEQ          : '!=';
GTE          : '>=';
LTE          : '<=';
AND          : '&&';
OR           : '||';

ASSIGN       : '=';
GT           : '>';
LT           : '<';
NOT          : '!';
PLUS         : '+';
MINUS        : '-';
STAR         : '*';
DIV          : '/';
MOD          : '%';

LPAREN       : '(';
RPAREN       : ')';
LBRACE       : '{';
RBRACE       : '}';
SEMI         : ';';
COMMA        : ',';
DOT          : '.';

FLOAT
    : [0-9]+ '.' [0-9]+
    ;

INT
    : [0-9]+
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    ;

CHAR
    : '\'' (~['\\] | '\\' .) '\''
    ;

CLASS_ID
    : [A-Z][a-zA-Z0-9_]*
    ;

ID
    : [a-z][a-zA-Z0-9_]*
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;