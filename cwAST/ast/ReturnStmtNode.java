package ast;

public class ReturnStmtNode extends StmtNode {
    public ExprNode ret = null;

    public ReturnStmtNode(ExprNode ret) {
        this.ret = ret;
    }
    public ReturnStmtNode (){
    }
}
