package ast;

public class WhileStmtNode extends StmtNode {
    protected ExprNode condition;
    protected StmtListNode body;

    public WhileStmtNode(ExprNode condition, StmtListNode body) {
        this.condition = condition;
        this.body = body;
    }
}
