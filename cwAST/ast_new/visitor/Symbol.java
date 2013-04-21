package visitor;

import java.util.List;

import ast.VarDeclNode;

public class Symbol {

	private String id;
	private Kind kind;
	private List<VarDeclNode> types;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public List<VarDeclNode> getTypes() {
		return types;
	}

	public void setTypes(List<VarDeclNode> types) {
		this.types = types;
	}

}
