package ast;

import visitor.Visitor;

public class FactorNode extends Node {
	
	public ExponentNode lhs;
	public FactorNode rhs;

	public FactorNode(ExponentNode lhs, FactorNode rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
