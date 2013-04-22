package ast.statement;

import visitor.Visitor;
import ast.expression.ExprListNode;

public class FunctionCallStmtNode extends StmtNode {
    
	public String id;
    public ExprListNode  parameters;

    public FunctionCallStmtNode(String id,ExprListNode parameters) {
        this.parameters = parameters;
    }

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
