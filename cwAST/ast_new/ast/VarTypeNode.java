package ast;

import visitor.Visitor;

public class VarTypeNode extends Node {

	public String id;
	public String type;

	public VarTypeNode(String id, String type) {
		this.id = id;
		this.type = type;
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

}
