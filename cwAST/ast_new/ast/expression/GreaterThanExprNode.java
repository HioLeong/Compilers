package ast.expression;

import ast.term.TermNode;


public class GreaterThanExprNode extends BinaryExprNode {
	
    public GreaterThanExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
