package ast;

public class IfElseStmtNode extends StmtNode {

	protected ExprNode condition;
	protected StmtList ifbody;
	protected StmtList elsebody;

    public IfElseStmtNode(ExprNode condition, StmtList ifbody, StmtList elsebody) {
    	this.condition = condition;
    	this.ifbody = ifbody;
    	this.elsebody = elsebody;
    }
}
