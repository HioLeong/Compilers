package ast;

import visitor.Visitor;
import ast.statement.StmtListNode;

public class BlockNode extends Node {

	public LocalDeclListNode ldl;
	public StmtListNode sl;
	
    public BlockNode(LocalDeclListNode ldl, StmtListNode sl) {
    	this.ldl=ldl;
    	this.sl=sl;
    }  
    public BlockNode(StmtListNode sl) {
    	this.sl=sl;
    }
	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}  


}
