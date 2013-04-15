package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class EqualExprNode extends BinaryExprNode {
    public EqualExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
