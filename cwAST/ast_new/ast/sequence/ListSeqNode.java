package ast.sequence;

import visitor.Visitor;
import ast.expression.ExprListNode;

public class ListSeqNode extends SeqNode {

    public ListSeqNode(ExprListNode exprList) {
       	super(exprList);
    }

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
