package ast;

import java.util.List;

public class ExprListSNode extends Node {

	public List<ExprNode> expressions;

	public ExprListSNode(List<ExprNode> expressions) {
		this.expressions = expressions;
	}
}
