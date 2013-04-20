package ast;

import java.util.List;

public class VarInitNode extends Node {

	public ExprListNode el;

    public VarInitNode(ExprListNode el) {
    	this.el=el;
    }  


}
