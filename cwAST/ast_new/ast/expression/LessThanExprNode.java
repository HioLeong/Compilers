package ast.expression;

import ast.term.TermNode;

public class LessThanExprNode extends BinaryExprNode {
    public LessThanExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
