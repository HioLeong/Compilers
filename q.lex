import java_cup.*;
class QSymbol extends java_cup.runtime.Symbol
{
	/* Fields */
	private int symbol;
	private int line;
	private int col;
	private java.lang.Object obj;

	/* Constructors */
	public QSymbol(int symbol, int line, int col) {
	super(symbol,line,col);
	}
	
	public QSymbol(int symbol,java.lang.Object value,int line, int col) {
	super(symbol,line,col,value);
	}

	/* Methods */
	public int getSymbol() {
    return symbol;
	}
	public java.lang.Object getValue(){
	return value;
	}
	public int getLine() {
	return line;
	}

	public int getCol() {
	return col; 
	}
}

%%

%cup
%line
%char

/* WHITESPACE  (whitespace = [\ \t\r\n\f]) */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

/* COMMENTS */
Comment = {MultipleLineComment} | {EndOfLineComment} 
MultipleLineComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}

/* IDENTIFIER CASE SENSITIVE */
Identifier = {Letter} ({Letter}|{Digit})*

type = bool|int|float|char|string|list|tuple

/* CHARACTER */
Letter = [a-zA-Z]
Digit = [0-9]
Character = {Letter} | {Digit}
char = \' {Character} \'

/* SEQUENCES (list,tuple) */
string = \" ({Character}*) \"

/* BOOLEAN */
bool = true|false

/* NUMBERS */
number = 0 | [1-9] [0-9]*
int = \-?{number}
float =  \-? ({int} \. {Digit}+)

%%

"!" {return new QSymbol(sym.NOT, yyline,yychar);}
"||" {return new QSymbol(sym.OR, yyline,yycolumn);}
"&&" {return new QSymbol(sym.AND, yyline,yycolumn);}

"+" {return new QSymbol(sym.PLUS, yyline,yycolumn);}
"-" {return new QSymbol(sym.MINUS, yyline,yycolumn);}
"*" {return new QSymbol(sym.TIMES, yyline,yycolumn);}
"/" {return new QSymbol(sym.DIVIDE, yyline,yycolumn);}
"^" {return new QSymbol(sym.POWER, yyline,yycolumn);}

"in" {return new QSymbol(sym.IN, yytext(), yyline,yycolumn);}
"::" {return new QSymbol(sym.CONCAT, yyline,yycolumn);}
"len" {return new QSymbol(sym.LEN, yytext(), yyline,yycolumn);}

"<" {return new QSymbol(sym.LESS, yyline,yycolumn);}
"<=" {return new QSymbol(sym.EQLESS, yyline,yycolumn);}
">" {return new QSymbol(sym.GREATER, yyline,yycolumn);}
">=" {return new QSymbol(sym.GREATEREQ, yyline,yycolumn);}
"==" {return new QSymbol(sym.EQ, yyline,yycolumn);}
"!=" {return new QSymbol(sym.NEQ, yyline,yycolumn);}

"{" {return new QSymbol(sym.LCURL, yyline,yycolumn);}
"}" {return new QSymbol(sym.RCURL, yyline,yycolumn);}
"(" {return new QSymbol(sym.LPRAN, yyline,yycolumn);}
")" {return new QSymbol(sym.RPRAN, yyline,yycolumn);}
"[" {return new QSymbol(sym.LBRACE, yyline,yycolumn);}
"]" {return new QSymbol(sym.RBRACE, yyline,yycolumn);}
"=" {return new QSymbol(sym.ASSIGN, yyline,yycolumn);}
":" {return new QSymbol(sym.COLON, yyline,yycolumn);}
";" {return new QSymbol(sym.SEMI, yyline,yycolumn);}
"," {return new QSymbol(sym.COMMA, yyline,yycolumn);}
"." {return new QSymbol(sym.DOT, yyline,yycolumn);}

"[|" {return new QSymbol(sym.LTUPLE, yyline,yycolumn);}
"|]" {return new QSymbol(sym.RTUPLE, yyline,yycolumn);}

"tdef" {return new QSymbol(sym.TDEF, yytext(), yyline,yycolumn);}
"fdef" {return new QSymbol(sym.FDEF, yytext(), yyline,yycolumn);}

"void" {return new QSymbol(sym.VOID, yyline,yycolumn);}

"if" {return new QSymbol(sym.IF, yytext(), yyline,yycolumn);}
"else" {return new QSymbol(sym.ELSE, yytext(), yyline,yycolumn);}
"while" {return new QSymbol(sym.WHILE, yytext(), yyline,yycolumn);}
"do" {return new QSymbol(sym.DO, yytext(), yyline,yycolumn);}
"repeat" {return new QSymbol(sym.REPEAT, yytext(), yyline,yycolumn);}
"until" {return new QSymbol(sym.UNTIL, yytext(), yyline,yycolumn);}
"return" {return new QSymbol(sym.RETURN, yytext(), yyline,yycolumn);}

{type} {return new QSymbol(sym.TYPE, yytext(),yyline,yycolumn);}
{bool} {return new QSymbol(sym.BOOL, (new Boolean(yytext()).booleanValue()),yyline,yycolumn);}
{int} {return new QSymbol(sym.INT, (new Integer(yytext()).intValue()),yyline,yycolumn);}
{float} {return new QSymbol(sym.FLOAT, (new Float(yytext()).floatValue()),yyline,yycolumn);}
{char} {return new QSymbol(sym.CHAR, (new Character(yytext().charAt(1))),yyline,yycolumn);}
{string} {return new QSymbol(sym.STRING, yytext(),yyline,yycolumn) ;}

{Identifier} {return new QSymbol(sym.ID, yytext(),yyline,yycolumn);}
{WhiteSpace} {}
{Comment} {}

. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);}
