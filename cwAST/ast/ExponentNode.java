package ast;

import visitor.Visitor;

public class ExponentNode extends Node {

	public Node node;

	public ExponentNode(Node node) {
		this.node = node;
	}

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}

}