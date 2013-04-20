package ast;

import java.util.List;

public class FunctionDeclNode extends GlobalDeclNode {

	protected ParameterListNode pl;
	protected String ft;
	protected BlockNode b;
	
    public FunctionDeclNode(ParameterListNode pl, String ft,BlockNode b) {
    	this.b=b;
    	this.ft=ft;
    	this.pl=pl;
    }  


}
