package ast.term;

import visitor.Visitor;
import ast.FactorNode;

public class AndTermNode extends BinaryTermNode {

    public AndTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
