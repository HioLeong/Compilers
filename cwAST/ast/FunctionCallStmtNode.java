package ast;

public class FunctionCallStmtNode extends StmtNode {
    protected ExprListNode  parameters;

    public FunctionCallStmtNode(ExprListNode parameters) {
        this.parameters = parameters;
    }
}
