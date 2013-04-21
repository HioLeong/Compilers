package ast.statement;

import ast.expression.ExprListNode;

public class FunctionCallStmtNode extends StmtNode {
    
    public ExprListNode  parameters;

    public FunctionCallStmtNode(ExprListNode parameters) {
        this.parameters = parameters;
    }
}
