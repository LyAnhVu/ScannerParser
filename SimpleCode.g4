grammar SimpleCode;
program
	: CLASS PROGRAM '{' Field_decl* Method_decl* '}'
	;


//
//	KEYWORDS
//
BOOLEAN : 'boolean';
BREAK : 'break';
CALLOUT : 'callout';
CLASS : 'class';
CONTINUE : 'continue';
ELSE : 'else';
FALSE : 'false';
FOR : 'for';
IF : 'if';
INT : 'int';
RETURN : 'return';
TRUE : 'true';
VOID : 'void';
PROGRAM : 'Program'; 
	
Field_decl
	: Type ( IDENTIFIER | IDENTIFIER '[' INTLITERAL ']' )+','
	;
	

Method_decl
	: (Type | VOID) IDENTIFIER '(' [(Type IDENTIFIER)+','] ')' Block
	;


Block
	: '{' Var_decl* Statement* '}'
	;

	
Var_decl
	: Type IDENTIFIER+','
	;

	
Type
	: INT
	| BOOLEAN
	;
	
	
Statement
	: Location Assign_op Expr
	| Method_call
	| IF '(' Expr ')' Block [ELSE Block]
	| FOR (IDENTIFIER) '=' Expr ',' Expr Block
	| RETURN [Expr]
	| BREAK
	| CONTINUE
	| Block
	;

	
Assign_op
	: '='
	| '+='
	| '-='
	;
	
	
Method_call
	: Method_name ([Expr+','])
	| CALLOUT (STRINGLITERAL [',' Callout_arg+','])
	;

	
Method_name
	: IDENTIFIER
	;
	

Location
	: IDENTIFIER
	| IDENTIFIER '[' Expr ']'
	;

	
Expr
	: Location
	| Method_call
	| Literal
//	| Expr Bin_op Expr
//	| '-' Expr
//	| '!' Expr
//	| '(' Expr ')'
	;

	
Callout_arg
	: Expr
	| STRINGLITERAL
	;
	
	
Bin_op
	: Arith_op
	| Rel_op
	| Eq_op
	| Cond_op
	;
	
	
Arith_op
	: '+' | '-' | '*' | '/' | '%'
	;


Rel_op
	: '<' | '>' |  '<='  | '>='
	;

	
Eq_op 
	:  '=='  | '!='
	;

	
Cond_op
	: 	'&&'  |  '||'
	;
	
	
Literal
	: INTLITERAL
	| CHARLITERAL
	| BOOLEANLITERAL
	| STRINGLITERAL
	;

	
IDENTIFIER
	:	Alpha Alpha_num*
	;


Alpha_num
	: Alpha
	| Digit
	;


Alpha
	:	[a-zA-Z$_]
	|	'_'
	;
	

Digit
	:	[0-9]
	;


Hex_digit
	: Digit	| 'a' | 'b' | 'c' | 'd' | 'e' | 'f' 
			| 'A' | 'B' | 'C' | 'D' | 'E' | 'F' 
	;


INTLITERAL
	: Decimal_literal
	| Hex_literal
	;

	
Decimal_literal
	: Digit Digit*
	;

	
Hex_literal
	: '0x' Hex_digit Hex_digit*
	;
	
	
BOOLEANLITERAL
	: TRUE | FALSE
	;

	
CHARLITERAL
	: '\'' Char '\''
	;

	
STRINGLITERAL
	: '"' Char* '"'
	;
	
	
//
//	Whitespace and comments
//
WS  
	:  	[ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;
    
LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ; 

Char
	: '\"' | '\'' | '\\' | '\\t' | '\\n'
	| ~['\\\r\n]
	;