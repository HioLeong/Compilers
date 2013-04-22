package ast.expression;

import visitor.Visitor;
import ast.term.TermNode;

public class InExprNode extends BinaryExprNode {
    public InExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
