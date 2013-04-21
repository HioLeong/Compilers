package ast;

import visitor.Visitor;

public class DataTypeDeclNode extends GlobalDeclNode {

	public ParameterListNode pl;

	public DataTypeDeclNode(ParameterListNode pl) {
		this.pl=pl;
	}

	@Override
	public Object accept(Visitor visitor) {
		return null;
	}  


}
