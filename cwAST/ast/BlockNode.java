package ast;

import java.util.List;

public class BlockNode extends Node {

	protected LocalDeclListNode ldl;
	protected StmtListNode sl;
	
    public BlockNode(LocalDeclListNode ldl, StmtListNode sl) {
    	this.ldl=ldl;
    	this.sl=sl;
    }  
    public BlockNode(StmtListNode sl) {
    	this.sl=sl;
    }  


}
