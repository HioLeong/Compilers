package ast.expression;

import visitor.Visitor;
import ast.Node;

public class ExprListNode extends Node {

    public ExprNode e;
    public ExprListSNode el; 

    public ExprListNode(ExprNode e,ExprListSNode el) {
        this.e = e;
        this.el = el;
    }

	@Override
	public Object accept(Visitor visitor) {
		return null;
	}
}
