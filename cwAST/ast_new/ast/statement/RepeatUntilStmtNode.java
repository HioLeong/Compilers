package ast.statement;

import ast.expression.ExprNode;

public class RepeatUntilStmtNode extends StmtNode {
	public StmtListNode body;
	public ExprNode condition;

	public RepeatUntilStmtNode(StmtListNode body, ExprNode condition) {
		this.body = body;
		this.condition = condition;
	}
}
