package ast.statement;

import ast.expression.ExprNode;

public class IfElseStmtNode extends StmtNode {

	public ExprNode condition;
	public StmtListNode ifbody;
	public StmtListNode elsebody;

	public IfElseStmtNode(ExprNode condition, StmtListNode ifbody,
			StmtListNode elsebody) {
		this.condition = condition;
		this.ifbody = ifbody;
		this.elsebody = elsebody;
	}
}
