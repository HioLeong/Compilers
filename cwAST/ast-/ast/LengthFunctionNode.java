package ast;

import visitor.Visitor;
import ast.expression.ExprNode;

public class LengthFunctionNode extends Node {

	public ExprNode exprNode;

	public LengthFunctionNode(ExprNode exprNode) {
		this.exprNode = exprNode;
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

}
