package ast;

import visitor.Visitor;

public class DataTypeDeclNode extends GlobalDeclNode {

	public String typeName;
	public ParameterListNode pl;

	public DataTypeDeclNode(String typeName,ParameterListNode pl) {
		this.type=typeName;
		this.pl=pl;
	}

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}  


}
