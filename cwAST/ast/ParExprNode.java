package ast;

public class ParExprNode extends ExprNode {


	public ExprNode expr1; 
	public ExprNode expr2;
	public ExprNode expr3;
    
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