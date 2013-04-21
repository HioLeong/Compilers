package ast.expression;

import ast.term.TermNode;

public class OrExprNode extends BinaryExprNode {
    public OrExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
