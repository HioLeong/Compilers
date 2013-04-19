package ast;

public class ExprListNode extends Node {

    protected ExprNode e;
    protected ExprListSNode el; 

    public ExprListNode(ExprNode e,ExprListSNode el) {
        this.e = e;
        this.el = el;
    }
}
