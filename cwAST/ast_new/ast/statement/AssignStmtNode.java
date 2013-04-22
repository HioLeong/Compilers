package ast.statement;

import visitor.Visitor;
import ast.AccessNode;
import ast.expression.ExprNode;

public class AssignStmtNode extends StmtNode {
    
    public AccessNode a;
    public ExprNode rhs;

    public AssignStmtNode(AccessNode a, ExprNode rhs) {
        this.a = a;
        this.rhs = rhs;
    }

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
