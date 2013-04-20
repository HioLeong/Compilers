package ast;

public abstract class ParExprNode extends ExprNode {


	protected ExprNode expr1; 
	protected ExprNode expr2;
	protected ExprNode expr3;
    
    public ParExprNode(ExprNode expr1, ExprNode expr2) {
       this.expr1=expr1;
       this.expr2=expr2;
    }

    public ParExprNode(ExprNode expr1, ExprNode expr2, ExprNode expr3) {
       this.expr1=expr1;
       this.expr2=expr2;
       this.expr3=expr3;
    }
}