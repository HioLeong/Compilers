package visitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ast.VarTypeNode;

public class SymbolTable {

	public SymbolTable parent;
	public List<SymbolTable> children;
	public Map<String, Symbol> symbols = new HashMap<String, Symbol>();

	public boolean put(Symbol symbol) {

		if (symbols.containsKey(symbol.getId())) {
			System.out.println("Error, " + symbol.getId() + " already exists.");
			return false;
		} else {
			symbols.put(symbol.getId(), symbol);
			return true;
		}
	}

	public List<VarTypeNode> getTypes(String key) {
		return symbols.get(key).getTypes();
	}

	public boolean lookup(String id) {
		return symbols.containsKey(id);
	}

	public Symbol search(String id) {
		return symbols.get(id);
	}

	public SymbolTable beginScope() {
		SymbolTable table = new SymbolTable();
		table.parent = this;
		table.children.add(table);
		return table;
	}

	public SymbolTable endScope() {
		return parent;
	}

}
