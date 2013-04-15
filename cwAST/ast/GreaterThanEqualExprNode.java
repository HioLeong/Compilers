package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class GreaterThanEqualExprNode extends BinaryExprNode {
    public GreaterThanEqualExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
