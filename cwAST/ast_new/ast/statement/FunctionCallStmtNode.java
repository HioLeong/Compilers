package ast.statement;

import visitor.Visitor;
import ast.expression.ExprListNode;

public class FunctionCallStmtNode extends StmtNode {
    
    public ExprListNode  parameters;

    public FunctionCallStmtNode(ExprListNode parameters) {
        this.parameters = parameters;
    }

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
