package ast;

import java.util.List;

public class GlobalDeclListNode extends Node {

	public List<GlobalDeclNode> statements;

	public GlobalDeclListNode(List<GlobalDeclNode> statements) {
		this.statements = statements;
	}

}
