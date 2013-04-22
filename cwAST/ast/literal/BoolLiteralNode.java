package ast.literal;

import visitor.Visitor;

public class BoolLiteralNode extends LiteralNode {

	public boolean literal;
	
	public BoolLiteralNode(boolean literal) {
		this.literal = literal;
	}

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
	
}
