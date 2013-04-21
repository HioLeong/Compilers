package ast.term;

import visitor.Visitor;
import ast.FactorNode;

public class PowerTermNode extends BinaryTermNode {

	public PowerTermNode(TermNode lhs, FactorNode rhs) {
		super(lhs, rhs);
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
