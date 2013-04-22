package ast.statement;

import visitor.Visitor;
import ast.expression.ExprNode;

public class WhileStmtNode extends StmtNode {
	
	public ExprNode condition;
	public StmtListNode body;

	public WhileStmtNode(ExprNode condition, StmtListNode body) {
		this.condition = condition;
		this.body = body;
	}

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
