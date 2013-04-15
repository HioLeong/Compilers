package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class OrExprNode extends BinaryExprNode {
    public OrExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
