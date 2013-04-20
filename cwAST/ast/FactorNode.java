package ast;

public class FactorNode extends Node {
	protected ExponentNode lhs;
	protected FactorNode rhs;

	public FactorNode(ExponentNode lhs, FactorNode rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
}
