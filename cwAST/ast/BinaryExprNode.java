package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class BinaryExprNode extends ExprNode {

    public ExprNode lhs; // left-hand side
    public TermNode rhs; // right-hand side

    public BinaryExprNode(ExprNode lhs, TermNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
