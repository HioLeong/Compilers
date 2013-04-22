package ast.sequence;

import visitor.Visitor;
import ast.expression.ExprListNode;

public class ListSeqNode extends SeqNode {

	public ExprListNode exprList;

	public ListSeqNode(ExprListNode exprList) {
		this.exprList = exprList;
	}

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
