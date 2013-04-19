package ast;

import java.util.List;

public class VarDeclNode extends GlobalDeclNode {

	protected VarTypeNode vt;
	protected VarInitNode vi;

    public VarDeclNode(VarTypeNode vt, VarInitNode vi) {
    	this.vt=vt;
    	this.vi=vi;
    }  


}
