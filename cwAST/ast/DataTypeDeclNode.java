package ast;

import java.util.List;

public class DataTypeDeclNode extends GlobalDeclNode {

	public ParameterListNode pl;

	public DataTypeDeclNode(ParameterListNode pl) {
		this.pl=pl;
	}  


}
