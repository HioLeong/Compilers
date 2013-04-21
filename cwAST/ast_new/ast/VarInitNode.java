package ast;

import java.util.List;

import ast.expression.ExprListNode;

public class VarInitNode extends Node {

	public ExprListNode el;

    public VarInitNode(ExprListNode el) {
    	this.el=el;
    }  


}
