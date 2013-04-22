package ast;

import visitor.Visitor;
import ast.expression.ExprListNode;

public class VarInitNode extends Node {

	public ExprListNode el;

	public VarInitNode(ExprListNode el) {
		this.el = el;
	}

	@Override
	public Object accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
