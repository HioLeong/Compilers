package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class FactorNode extends TermNode {

    protected TermNode lhs; // left-hand side
    protected FactorNode rhs; // right-hand side

    public FactorNode(TermNode lhs, FactorNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
