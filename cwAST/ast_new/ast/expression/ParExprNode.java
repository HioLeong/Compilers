package ast.expression;

import visitor.Visitor;


public class ParExprNode extends ExprNode {

	public ExprNode outExpr; 
	public ExprNode expr1;
    
    public ParExprNode(ExprNode outExpr, ExprNode expr1) {
       this.outExpr=outExpr;
       this.expr1=expr1;
    }

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}