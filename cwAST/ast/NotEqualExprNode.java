package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class NotEqualExprNode extends BinaryExprNode {
    public NotEqualExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
