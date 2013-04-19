package ast;

import java.util.List;

public class VarInitNode extends Node {

	protected ExprListNode el;

    public VarInitNode(ExprListNode el) {
    	this.el=el;
    }  


}
