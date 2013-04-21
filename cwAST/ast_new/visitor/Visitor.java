package visitor;

import ast.*;
import ast.term.*;
import ast.statement.*;
import ast.expression.*;
import ast.sequence.*;

public interface Visitor {
	
	public boolean visit(BlockNode node);
	
	/* Term Nodes */
	public boolean visit(MultiplyTermNode node);
	public boolean visit(AndTermNode node);
	public boolean visit(DivideTermNode node);
	public boolean visit(PowerTermNode node);
	
	/* Statement Nodes */
	public boolean visit(AssignStmtNode node);
	public boolean visit(FunctionCallStmtNode node);
	public boolean visit(IfElseStmtNode node);
	public boolean visit(RepeatUntilStmtNode node);
	public boolean visit(ReturnStmtNode node);
	public boolean visit(WhileStmtNode node);
	
	/* Expression Nodes */
	public boolean visit(BinaryExprNode node);
	public boolean visit(ConcatExprNode node);
	public boolean visit(EqualExprNode node);
	public boolean visit(GreaterThanEqualExprNode node);
	public boolean visit(GreaterThanExprNode node);
	public boolean visit(InExprNode node);
	public boolean visit(LessThanEqualExprNode node);
	public boolean visit(LessThanExprNode node);
	public boolean visit(MinusExprNode node);
	public boolean visit(NotEqualExprNode node);
	public boolean visit(OrExprNode node);
	public boolean visit(PlusExprNode node);
	
	/* Sequence Nodes */
	public boolean visit(ListSeqNode node);
	public boolean visit(TupleSeqNode node);
	public boolean visit(StringSeqNode node);
	
}
