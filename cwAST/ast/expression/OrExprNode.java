package ast.expression;

import visitor.Visitor;
import ast.term.TermNode;

public class OrExprNode extends BinaryExprNode {
    public OrExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
