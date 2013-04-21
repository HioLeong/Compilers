package visitor;

import ast.BlockNode;
import ast.ExponentNode;
import ast.FactorNode;
import ast.GlobalDeclListNode;
import ast.LengthFunctionNode;
import ast.LocalDeclListNode;
import ast.ParameterListNode;
import ast.VarDeclNode;
import ast.expression.BinaryExprNode;
import ast.expression.ConcatExprNode;
import ast.expression.EqualExprNode;
import ast.expression.GreaterThanEqualExprNode;
import ast.expression.GreaterThanExprNode;
import ast.expression.InExprNode;
import ast.expression.LessThanEqualExprNode;
import ast.expression.LessThanExprNode;
import ast.expression.MinusExprNode;
import ast.expression.NotEqualExprNode;
import ast.expression.OrExprNode;
import ast.expression.PlusExprNode;
import ast.sequence.ListSeqNode;
import ast.sequence.StringSeqNode;
import ast.sequence.TupleSeqNode;
import ast.statement.AssignStmtNode;
import ast.statement.FunctionCallStmtNode;
import ast.statement.IfElseStmtNode;
import ast.statement.RepeatUntilStmtNode;
import ast.statement.ReturnStmtNode;
import ast.statement.StmtListNode;
import ast.statement.WhileStmtNode;
import ast.term.AndTermNode;
import ast.term.DivideTermNode;
import ast.term.MultiplyTermNode;
import ast.term.PowerTermNode;

public class SementicVisitor implements Visitor {

	public SymbolTable table;
	public int NumberOfErrors = 0;

	public SementicVisitor() {
		table = new SymbolTable();
	}

	@Override
	public Boolean visit(BlockNode node) {

		// Visit the Local Declaration List
		if (node.ldl != null) {
			node.ldl.accept(this);
		}

		// Visit the Statement List
		if (node.sl != null) {
			node.sl.accept(this);
		}
		return null;
	}

	@Override
	public Boolean visit(MultiplyTermNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(AndTermNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(DivideTermNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(PowerTermNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(AssignStmtNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(FunctionCallStmtNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(IfElseStmtNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(RepeatUntilStmtNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(ReturnStmtNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(WhileStmtNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(BinaryExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(ConcatExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(EqualExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(GreaterThanEqualExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(GreaterThanExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(InExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(LessThanEqualExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(LessThanExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(MinusExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(NotEqualExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(OrExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(PlusExprNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(ListSeqNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(TupleSeqNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(StringSeqNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(StmtListNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(GlobalDeclListNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(LocalDeclListNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(LengthFunctionNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(ParameterListNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(VarDeclNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(ExponentNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean visit(FactorNode node) {
		// TODO Auto-generated method stub
		return null;
	}

}