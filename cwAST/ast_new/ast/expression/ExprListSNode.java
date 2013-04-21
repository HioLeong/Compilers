package ast.expression;
import java.util.List;


import java.util.List;

import ast.Node;

public class ExprListSNode extends Node {

	public List<ExprNode> expressions;

	public ExprListSNode(List<ExprNode> expressions) {
		this.expressions = expressions;
	}
}
