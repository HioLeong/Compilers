package ast.sequence;

import visitor.Visitor;
import ast.expression.ExprListNode;


public class TupleSeqNode extends SeqNode {
	public TupleSeqNode(ExprListNode exprlist){
		super(exprlist);
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
