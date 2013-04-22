package ast;

import visitor.Visitor;

public class ParameterListNode extends Node {

	public VarTypeNode varTypeNode;
	public ParameterListSNode parameterListSNode;

	public ParameterListNode(VarTypeNode varTypeNode,
			ParameterListSNode parameterListSNode) {
		this.varTypeNode = varTypeNode;
		this.parameterListSNode = parameterListSNode;
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}