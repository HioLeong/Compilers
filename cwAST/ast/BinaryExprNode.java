package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class BinaryExprNode extends ExprNode {

    protected ExprNode lhs; // left-hand side
    protected TermNode rhs; // right-hand side

    public BinaryExprNode(ExprNode lhs, TermNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
