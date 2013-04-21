package ast.statement;

import ast.AccessNode;
import ast.expression.ExprNode;

public class AssignStmtNode extends StmtNode {
    
    public AccessNode a;
    public ExprNode rhs;

    public AssignStmtNode(AccessNode a, ExprNode rhs) {
        this.a = a;
        this.rhs = rhs;
    }
}
