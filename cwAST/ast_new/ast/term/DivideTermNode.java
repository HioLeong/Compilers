package ast.term;

import visitor.Visitor;
import ast.FactorNode;


public class DivideTermNode extends BinaryTermNode {

    public DivideTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
