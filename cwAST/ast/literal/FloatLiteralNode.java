package ast.literal;

import visitor.Visitor;

public class FloatLiteralNode extends LiteralNode {

	public float literal;
	
	public FloatLiteralNode(float literal) {
		this.literal = literal;
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
