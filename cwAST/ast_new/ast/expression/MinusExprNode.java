package ast.expression;

import ast.term.TermNode;

public class MinusExprNode extends BinaryExprNode {
    public MinusExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
