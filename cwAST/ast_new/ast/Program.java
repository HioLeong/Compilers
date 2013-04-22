package ast;

import visitor.Visitor;
import ast.*;

public class Program extends Node {

	public GlobalDeclListNode gdl;
	public BlockNode bn;
	
    public Program(GlobalDeclListNode ldl, BlockNode bn) {
    	this.gdl=gdl;
    	this.bn=bn;
    }  
    public Program(BlockNode bn) {
    	this.bn=bn;
    }
	@Override
	public Object accept(Visitor visitor) {
		return visitor.visit(this);
	}  


}
