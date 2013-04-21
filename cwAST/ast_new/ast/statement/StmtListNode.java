package ast.statement;

import java.util.List;

import visitor.Visitor;

import ast.Node;

/**
 * Alternatively, one could use this class to implement a singly-linked list.
 */
public class StmtListNode extends Node {

    // instead of public visibility, rather use a method to access
    // this attribute
    public List<StmtNode> statements;

    public StmtListNode(List<StmtNode> statements) {
        this.statements = statements;
    }

	@Override
	public Object accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}  


}
