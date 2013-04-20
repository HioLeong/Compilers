package ast;

public class IfElseStmtNode extends StmtNode {

	protected ExprNode condition;
	protected StmtListNode ifbody;
	protected StmtListNode elsebody;

	public IfElseStmtNode(ExprNode condition, StmtListNode ifbody,
			StmtListNode elsebody) {
		this.condition = condition;
		this.ifbody = ifbody;
		this.elsebody = elsebody;
	}
}
