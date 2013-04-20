package ast;

public class NotEqualExprNode extends BinaryExprNode {
    public NotEqualExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
