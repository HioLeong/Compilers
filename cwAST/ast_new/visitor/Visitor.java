package visitor;

import ast.*;
import ast.term.*;
import ast.statement.*;
import ast.expression.*;
import ast.sequence.*;

public interface Visitor {
	
	/* Base */
	public Object visit(BlockNode node); //Done
	
	/* Term Nodes */
	public Object visit(MultiplyTermNode node);
	public Object visit(AndTermNode node);
	public Object visit(DivideTermNode node);
	public Object visit(PowerTermNode node);
	
	/* Statement Nodes */
	public Object visit(StmtListNode node);
	public Object visit(AssignStmtNode node);
	public Object visit(FunctionCallStmtNode node);
	public Object visit(IfElseStmtNode node);
	public Object visit(RepeatUntilStmtNode node);
	public Object visit(ReturnStmtNode node);
	public Object visit(WhileStmtNode node);
	
	/* Expression Nodes */
	public Object visit(BinaryExprNode node);
	public Object visit(ConcatExprNode node);
	public Object visit(EqualExprNode node);
	public Object visit(GreaterThanEqualExprNode node);
	public Object visit(GreaterThanExprNode node);
	public Object visit(InExprNode node);
	public Object visit(LessThanEqualExprNode node);
	public Object visit(LessThanExprNode node);
	public Object visit(MinusExprNode node);
	public Object visit(NotEqualExprNode node);
	public Object visit(OrExprNode node);
	public Object visit(PlusExprNode node);
	
	/* Sequence Nodes */
	public Object visit(ListSeqNode node);
	public Object visit(TupleSeqNode node);
	public Object visit(StringSeqNode node);
	
	/* Parameters, Declaration, etc */
	public Object visit(GlobalDeclListNode node);
	public Object visit(LocalDeclListNode node);
	public Object visit(LengthFunctionNode node);
	public Object visit(ParameterListNode node);
	public Object visit(DataTypeDeclNode node);
	public Object visit(VarDeclNode node);
	public Object visit(VarTypeNode node);
	public Object visit(VarInitNode node);
	public Object visit(ExponentNode node);
	public Object visit(FactorNode node);
	
}
