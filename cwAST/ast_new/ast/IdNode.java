package ast;

import visitor.Visitor;

public class IdNode extends Node {

	public String name;

	public IdNode(String name) {
		this.name = name;
	}

	@Override
	public Object accept(Visitor visitor) {
		return null;
	}
}
