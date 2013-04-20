package ast;

public class WhileStmtNode extends StmtNode {
    public ExprNode condition;
    public StmtListNode body;

    public WhileStmtNode(ExprNode condition, StmtListNode body) {
        this.condition = condition;
        this.body = body;
    }
}
