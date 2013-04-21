package ast.expression;

import visitor.Visitor;

public class ParSeqExprNode extends ExprNode {
	public ExprNode outExpr; 
	public ExprNode expr1=null;
	public ExprNode expr2=null;
	public ParSeqExprNode(ExprNode outExpr,ExprNode expr1,ExprNode expr2) {
		this.outExpr = outExpr;
		this.expr1=expr1;
		this.expr2=expr2;
	}
	public ParSeqExprNode(ExprNode outExpr,ExprNode expr1) {
		this.outExpr = outExpr;
		this.expr1=expr1;
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

}
