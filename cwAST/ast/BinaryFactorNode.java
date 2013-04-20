package ast;

public class BinaryFactorNode extends Node {
	ExponentNode lhs;
	FactorNode rhs;

	public BinaryFactorNode(ExponentNode lhs, FactorNode rhs){
		this.lhs=lhs;
		this.rhs=rhs;
	}	
}