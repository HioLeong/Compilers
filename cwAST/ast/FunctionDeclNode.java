package ast;

import java.util.List;

public class FunctionDeclNode extends Node {

	ParameterListNode pl;
	String ft;
	BlockNode b;
    public FunctionDeclNode(ParameterListNode pl, String ft,BlockNode b) {
    	this.b=b;
    	this.ft=ft;
    	this.pl=pl
    }  


}
