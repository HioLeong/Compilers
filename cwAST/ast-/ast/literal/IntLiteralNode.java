package ast.literal;

import visitor.Visitor;

public class IntLiteralNode extends LiteralNode {

	public int literal;

	public IntLiteralNode(int literal) {
		this.literal = literal;
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

}
