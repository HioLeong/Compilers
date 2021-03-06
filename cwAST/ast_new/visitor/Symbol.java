package visitor;

import java.util.List;

import ast.VarTypeNode;

public class Symbol {

	private String id;
	private Kind kind;
	private List<VarTypeNode> types;

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

	public List<VarTypeNode> getTypes() {
		return types;
	}

	public void setTypes(List<VarTypeNode> types) {
		this.types = types;
	}

}
