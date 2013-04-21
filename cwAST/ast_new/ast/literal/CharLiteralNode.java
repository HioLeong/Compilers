package ast.literal;

import visitor.Visitor;

public class CharLiteralNode extends LiteralNode {

	public char literal;
	
	public CharLiteralNode(char literal) {
		this.literal = literal;
	}

	@Override
	public Object accept(Visitor visitor) {
		return null;
	}
	
}
