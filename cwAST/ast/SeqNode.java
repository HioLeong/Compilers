package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class SeqNode extends Node {

	protected ExprListNode exprList;

	public SeqNode(ExprListNode exprList) {
		this.exprList = exprList;
	}
}
