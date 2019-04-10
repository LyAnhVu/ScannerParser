grammar SimpleCode;
program
	: CLASS PROGRAM '{' Field_decl* Method_decl* '}'
	;
	
scanner
	: Literal 
	| Id
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
	: Type ( Id | Id '[' Int_literal ']' )+','
	;
	

Method_decl
	: (Type | VOID) Id '(' [(Type Id)+','] ')' Block
	;


Block
	: '{' Var_decl* Statement* '}'
	;

	
Var_decl
	: Type Id+','
	;

	
Type
	: INT
	| BOOLEAN
	;
	
	
Statement
	: Location Assign_op Expr
	| Method_call
	| IF '(' Expr ')' Block [ELSE Block]
	| FOR (Id) '=' Expr ',' Expr Block
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
	| CALLOUT (String_literal [',' Callout_arg+','])
	;

	
Method_name
	: Id
	;
	

Location
	: Id
	| Id '[' Expr ']'
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
	| String_literal
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
	: Int_literal
	| Char_literal
	| Bool_literal
	| String_literal
	;

	
Id
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


Int_literal
	: Decimal_literal
	| Hex_literal
	;

	
Decimal_literal
	: Digit Digit*
	;

	
Hex_literal
	: '0x' Hex_digit Hex_digit*
	;
	
	
Bool_literal
	: TRUE | FALSE
	;

	
Char_literal
	: '\'' Char '\''
	;

	
String_literal
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