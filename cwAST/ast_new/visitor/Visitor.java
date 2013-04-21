package visitor;

import ast.*;
import ast.term.*;
import ast.statement.*;
import ast.expression.*;
import ast.sequence.*;

public interface Visitor {
	
	public Boolean visit(BlockNode node);
	
	/* Term Nodes */
	public Boolean visit(MultiplyTermNode node);
	public Boolean visit(AndTermNode node);
	public Boolean visit(DivideTermNode node);
	public Boolean visit(PowerTermNode node);
	
	/* Statement Nodes */
	public Boolean visit(StmtListNode node);
	public Boolean visit(AssignStmtNode node);
	public Boolean visit(FunctionCallStmtNode node);
	public Boolean visit(IfElseStmtNode node);
	public Boolean visit(RepeatUntilStmtNode node);
	public Boolean visit(ReturnStmtNode node);
	public Boolean visit(WhileStmtNode node);
	
	/* Expression Nodes */
	public Boolean visit(BinaryExprNode node);
	public Boolean visit(ConcatExprNode node);
	public Boolean visit(EqualExprNode node);
	public Boolean visit(GreaterThanEqualExprNode node);
	public Boolean visit(GreaterThanExprNode node);
	public Boolean visit(InExprNode node);
	public Boolean visit(LessThanEqualExprNode node);
	public Boolean visit(LessThanExprNode node);
	public Boolean visit(MinusExprNode node);
	public Boolean visit(NotEqualExprNode node);
	public Boolean visit(OrExprNode node);
	public Boolean visit(PlusExprNode node);
	
	/* Sequence Nodes */
	public Boolean visit(ListSeqNode node);
	public Boolean visit(TupleSeqNode node);
	public Boolean visit(StringSeqNode node);
	
	/* Parameters, Declaration, etc */
	public Boolean visit(GlobalDeclListNode node);
	public Boolean visit(LocalDeclListNode node);
	public Boolean visit(LengthFunctionNode node);
	public Boolean visit(ParameterListNode node);
	public Boolean visit(VarDeclNode node);
	public Boolean visit(ExponentNode node);
	public Boolean visit(FactorNode node);
	
}
