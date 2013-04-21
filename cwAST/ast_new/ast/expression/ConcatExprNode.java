package ast.expression;

import ast.term.TermNode;

public class ConcatExprNode extends BinaryExprNode {
    public ConcatExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
