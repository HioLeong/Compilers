package ast.expression;

import ast.term.TermNode;

public class GreaterThanEqualExprNode extends BinaryExprNode {
    public GreaterThanEqualExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
