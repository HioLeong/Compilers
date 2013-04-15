package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class MinusExprNode extends BinaryExprNode {
    public MinusExprNode(ExprNode lhs, TermNode rhs) {
        super(lhs,rhs);
    }
}
