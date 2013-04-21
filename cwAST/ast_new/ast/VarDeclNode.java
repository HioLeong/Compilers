package ast;

import java.util.List;

public class VarDeclNode extends GlobalDeclNode {

	public VarTypeNode vt;
	public VarInitNode vi;

    public VarDeclNode(VarTypeNode vt, VarInitNode vi) {
    	this.vt=vt;
    	this.vi=vi;
    }  


}
