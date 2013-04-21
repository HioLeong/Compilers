package ast;

import java.util.List;

import visitor.Visitor;

public class GlobalDeclListNode extends Node {

	public List<GlobalDeclNode> statements;

	public GlobalDeclListNode(List<GlobalDeclNode> statements) {
		this.statements = statements;
	}

	@Override
	public Object accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
