package ast;

public class BinaryFactorNode extends BinaryTermNode {
	ExponentNode lhs;
	FactorNode rhs;

	public BinaryFactorNode(ExponentNode lhs, FactorNode rhs){
		this.lhs=lhs;
		this.rhs=rhs;
	}	
}