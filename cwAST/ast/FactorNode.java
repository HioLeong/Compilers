package ast;

public class FactorNode extends Node {
	
	public ExponentNode lhs;
	public FactorNode rhs;

	public FactorNode(ExponentNode lhs, FactorNode rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
}
