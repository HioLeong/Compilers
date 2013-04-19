package ast;

public class AssignStmtNode extends StmtNode {
    protected AccessNode a;
    protected ExprNode rhs;

    public AssignStmtNode(AccessNode a, ExprNode rhs) {
        this.a = a;
        this.rhs = rhs;
    }
}
