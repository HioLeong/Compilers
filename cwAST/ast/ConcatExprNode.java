package ast;

public class ConcatExprNode extends BinaryExprNode {
    public ConcatExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
