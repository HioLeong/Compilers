package ast;

public class ParameterListNode extends Node {

	public VarTypeNode varTypeNode;
	public ParameterListSNode parameterListSNode;
	
	public ParameterListNode(VarTypeNode varTypeNode,ParameterListSNode parameterListSNode){
		this.varTypeNode = varTypeNode;
		this.parameterListSNode = parameterListSNode;
	}
}