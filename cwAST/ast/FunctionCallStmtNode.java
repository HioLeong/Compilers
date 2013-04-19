package ast;

public class FunctionCallStmtNode extends StmtNode {
    protected ExprListNode  parameters;

    public ReturnStmtNode(ExprListNode parameters) {
        this.parameters = parameters;
    }
}
