package ast.term;

import visitor.Visitor;
import ast.FactorNode;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public class MultiplyTermNode extends BinaryTermNode {

    public MultiplyTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }

	@Override 
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
