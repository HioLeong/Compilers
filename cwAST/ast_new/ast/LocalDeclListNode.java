package ast;

import java.util.List;

import visitor.Visitor;

public class LocalDeclListNode extends Node {

	public List<VarDeclNode> varDecls;

	public LocalDeclListNode(List<VarDeclNode> varDecls) {
		this.varDecls = varDecls;
	}

	@Override
	public Object accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
