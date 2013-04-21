package ast.expression;

import ast.term.TermNode;


public class PlusExprNode extends BinaryExprNode {
    public PlusExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
