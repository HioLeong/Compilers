package ast;

import ast.expression.ExprNode;

public class LengthFunctionNode extends Node {

	public ExprNode exprNode;

	public LengthFunctionNode(ExprNode exprNode) {
		this.exprNode = exprNode;
	}

}
