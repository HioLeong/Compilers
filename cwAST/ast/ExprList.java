package ast;

public class ExprList extends Node {

    protected ExprNode left; // left-hand side
    protected ExprList right; // right-hand side

    public ExprList(ExprNode left, ExprList right) {
        this.left = left;
        this.right = right;
    }
}
