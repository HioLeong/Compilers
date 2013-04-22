package ast.sequence;

import visitor.Visitor;



public class StringSeqNode extends SeqNode {

	public String str;

	public StringSeqNode(String str){
		this.str = str;
	}

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
