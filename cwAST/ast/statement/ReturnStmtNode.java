package ast.statement;

import visitor.Visitor;
import ast.expression.ExprNode;

public class ReturnStmtNode extends StmtNode {
    public ExprNode ret = null;

    public ReturnStmtNode(ExprNode ret) {
        this.ret = ret;
    }
    public ReturnStmtNode (){
    }
	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
