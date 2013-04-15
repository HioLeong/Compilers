package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class ConcatExprNode extends BinaryExprNode {
    public ConcatExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
