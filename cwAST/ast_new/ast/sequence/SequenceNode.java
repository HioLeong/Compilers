package ast.sequence;

import ast.Node;


public abstract class SequenceNode extends Node {
	public Object obj;
	public SequenceNode(Object obj){
		this.obj=obj;
	}
}
