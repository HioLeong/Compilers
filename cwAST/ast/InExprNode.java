package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class InExprNode extends BinaryExprNode {
    public InExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
