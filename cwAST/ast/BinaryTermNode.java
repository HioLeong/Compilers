package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class BinaryTermNode extends TermNode {

	protected TermNode lhs;
	protected FactorNode rhs;

    public BinaryTermNode(TermNode lhs, FactorNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
