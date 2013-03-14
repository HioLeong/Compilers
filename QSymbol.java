public class QSymbol extends java_cup.runtime.Symbol
{
	/* Fields */
	private int symbol;
	private int line;
	private int col;
	private java.lang.Object obj;

	/* Constructors */
	public QSymbol(int symbol, int line, int col) {
	this.symbol=symbol;
	this.line = line;
	this.col = col;
	}

	public QSymbol(int symbol,java.lang.Object value,int line, int col) {
	this.symbol=symbol;
	this.obj = value;
	this.line = line;
	this.col = col;
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