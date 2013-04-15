package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class LessThanEqualExprNode extends BinaryExprNode {
    public LessThanEqualExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
