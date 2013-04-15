package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class GreaterThanExprNode extends BinaryExprNode {
    public GreaterThanExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
