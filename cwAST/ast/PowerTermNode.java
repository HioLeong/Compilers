package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class PowerTermNode extends BinaryTermNode {

	public PowerTermNode(TermNode lhs, FactorNode rhs) {
		super(lhs, rhs);
	}
}
