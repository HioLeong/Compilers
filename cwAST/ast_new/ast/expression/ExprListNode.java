package ast.expression;

import ast.Node;

public class ExprListNode extends Node {

    public ExprNode e;
    public ExprListSNode el; 

    public ExprListNode(ExprNode e,ExprListSNode el) {
        this.e = e;
        this.el = el;
    }
}
