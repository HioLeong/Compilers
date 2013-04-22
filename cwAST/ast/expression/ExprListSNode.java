package ast.expression;
import java.util.List;

import visitor.Visitor;
import ast.Node;

public class ExprListSNode extends Node {

	public List<ExprNode> expressions;

	public ExprListSNode(List<ExprNode> expressions) {
		this.expressions = expressions;
	}

	@Override
	public Object accept(Visitor visitor) {

		return null;
	}
}
