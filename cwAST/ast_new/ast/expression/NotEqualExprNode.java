package ast.expression;

import ast.term.TermNode;

public class NotEqualExprNode extends BinaryExprNode {
    public NotEqualExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
