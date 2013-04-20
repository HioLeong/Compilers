package ast;

import java.util.List;

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


}
