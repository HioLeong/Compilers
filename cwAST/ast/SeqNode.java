package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class SeqNode extends Node {

	protected List<ExprNode> exprNodes;

	public SeqNode(List<ExprNode> exprNodes) {
        this.exprNodes = exprNodes;
    }
}
