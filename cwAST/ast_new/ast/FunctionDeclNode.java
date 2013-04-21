package ast;

import visitor.Visitor;

public class FunctionDeclNode extends GlobalDeclNode {

	public ParameterListNode pl;
	public String ft;
	public BlockNode b;
	
    public FunctionDeclNode(ParameterListNode pl, String ft,BlockNode b) {
    	this.b=b;
    	this.ft=ft;
    	this.pl=pl;
    }

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}  


}
