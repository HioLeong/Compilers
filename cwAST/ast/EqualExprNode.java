package ast;

public class EqualExprNode extends BinaryExprNode {
    public EqualExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
