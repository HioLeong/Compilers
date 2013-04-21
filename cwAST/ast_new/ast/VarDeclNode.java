package ast;

import visitor.Visitor;

public class VarDeclNode extends GlobalDeclNode {

	public VarTypeNode vt;
	public VarInitNode vi;

	public VarDeclNode(VarTypeNode vt, VarInitNode vi) {
		this.vt = vt;
		this.vi = vi;
	}

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

}
