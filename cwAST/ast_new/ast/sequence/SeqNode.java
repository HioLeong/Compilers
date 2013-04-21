package ast.sequence;

import ast.Node;
import ast.expression.ExprListNode;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class SeqNode extends Node {

	public ExprListNode exprList;

	public SeqNode(ExprListNode exprList) {
		this.exprList = exprList;
	}
}
