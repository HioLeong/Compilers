package ast.statement;

import visitor.Visitor;
import ast.expression.ExprNode;

public class RepeatUntilStmtNode extends StmtNode {
	public StmtListNode body;
	public ExprNode condition;

	public RepeatUntilStmtNode(StmtListNode body, ExprNode condition) {
		this.body = body;
		this.condition = condition;
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
