package ast;

public class ParameterListNode extends Node {

	private VarTypeNode varTypeNode;
	private ParameterListSNode parameterListSNode;
	
	public ParameterListNode(VarTypeNode varTypeNode,ParameterListSNode parameterListSNode){
		this.varTypeNode = varTypeNode;
		this.parameterListSNode = parameterListSNode;
	}
}