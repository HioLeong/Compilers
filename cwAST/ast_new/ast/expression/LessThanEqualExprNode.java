package ast.expression;

import ast.term.TermNode;

public class LessThanEqualExprNode extends BinaryExprNode {
    public LessThanEqualExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
