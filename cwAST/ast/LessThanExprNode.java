package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class LessThanExprNode extends BinaryExprNode {
    public LessThanExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
