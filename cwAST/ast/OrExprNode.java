package ast;

public class OrExprNode extends BinaryExprNode {
    public OrExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
