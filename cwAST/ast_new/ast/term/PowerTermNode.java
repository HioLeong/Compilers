package ast.term;

import ast.FactorNode;

public class PowerTermNode extends BinaryTermNode {

	public PowerTermNode(TermNode lhs, FactorNode rhs) {
		super(lhs, rhs);
	}
}
