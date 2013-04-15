package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class PlusExprNode extends BinaryExprNode {
    public PlusExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
