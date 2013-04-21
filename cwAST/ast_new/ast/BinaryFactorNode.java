package ast;

public class BinaryFactorNode extends Node {
	
	public ExponentNode lhs;
	public FactorNode rhs;

	public BinaryFactorNode(ExponentNode lhs, FactorNode rhs){
		this.lhs=lhs;
		this.rhs=rhs;
	}	
}