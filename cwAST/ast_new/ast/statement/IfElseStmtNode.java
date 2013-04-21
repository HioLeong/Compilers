package ast.statement;

import visitor.Visitor;
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

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
