package ast;

public class RepeatUntilStmtNode extends StmtNode {
    protected StmtListNode body;
    protected ExprNode condition;

    public ReturnStmtNode(StmtListNode body,ExprNode condition) {
        this.body = body;
        this.condition = condition;
    }
}
