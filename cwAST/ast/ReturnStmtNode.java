package ast;

public class ReturnStmtNode extends StmtNode {
    protected ExprNode ret = null;

    public ReturnStmtNode(ExprNode ret) {
        this.ret = ret;
    }
    public ReturnStmtNode (){
    }
}
