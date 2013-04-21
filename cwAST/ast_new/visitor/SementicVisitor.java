package visitor;

import java.util.ArrayList;
import java.util.List;

import ast.*;
import ast.expression.*;
import ast.sequence.*;
import ast.statement.*;
import ast.term.*;

public class SementicVisitor implements Visitor {

	public SymbolTable table;
	public int numberOfErrors = 0;
	
	private final static String FLOAT = "FLOAT";
	private final static String INT = "INT";
	private final static String BOOL = "BOOL";
	private final static String CHAR = "CHAR";
	private final static String STRING = "STRING";
	private final static String LIST = "LIST";
	private final static String TUPLE = "TUPLE";
	
	public SementicVisitor() {
		table = new SymbolTable();
	}

	@Override
	public Boolean visit(BlockNode node) {

		table = table.beginScope();

		// Visit the Local Declaration List
		if (node.ldl != null) {
			node.ldl.accept(this);
		}
		// Visit the Statement List
		if (node.sl != null) {
			node.sl.accept(this);
		}
		table = table.endScope();
		return null;
	}

	@Override
	public Boolean visit(MultiplyTermNode node) {
				if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(FLOAT))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(INT))){
			node.type=FLOAT;
		}
		else if(node.lhs.type.equals(INT)&&node.rhs.type.equals(INT)){
			node.type=INT;
		}
		else if(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT)){
			node.type=FLOAT;
		}
		else if(!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else {
			System.out.println("Type error found: Incorrect types for multiplication operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(AndTermNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if(node.lhs.type.equals(BOOL)&&node.rhs.type.equals(BOOL)){
			node.type=BOOL;
		}
		else if (!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else{
			System.out.println("Type error found: Incorrect types for and operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(DivideTermNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(FLOAT))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(INT))){
			node.type=FLOAT;
		}
		else if(node.lhs.type.equals(INT)&&node.rhs.type.equals(INT)){
			node.type=INT;
		}
		else if(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT)){
			node.type=FLOAT;
		}
		else if(!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else {
			System.out.println("Type error found: Incorrect types for division operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(PowerTermNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(FLOAT))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(INT))){
			node.type=FLOAT;
		}
		else if(node.lhs.type.equals(INT)&&node.rhs.type.equals(INT)){
			node.type=INT;
		}
		else if(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT)){
			node.type=FLOAT;
		}
		else if(!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else {
			System.out.println("Type error found: Incorrect types for power operation.");
		}
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
		
		return null;
	}

	@Override
	public Boolean visit(BinaryExprNode node) {
		
		// Probably don't need this.
		return null;
	}

	@Override
	public Boolean visit(ConcatExprNode node) {
		if (node.lhs != null) {
			node.lhs.accept(this);
		}
		if (node.rhs != null) {
			node.lhs.accept(this);
		}
		if(node.lhs.type.equals(LIST)||node.lhs.type.equals(TUPLE)||node.lhs.type.equals(STRING)){
			if(node.rhs.type.equals(LIST)||node.rhs.type.equals(TUPLE)||node.rhs.type.equals(STRING)){
				if(node.lhs.type.equals(node.rhs.type)){
					node.type=node.lhs.type;
				}
			}
			else{
				System.out.println("Type error found: Applying concatination on type "+node.rhs.type);
			}
		}
		else{
			System.out.println("Type error found: Applying concatination on type "+node.lhs.type);
		}
		return null;
	}

	@Override
	public Boolean visit(EqualExprNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(INT))||(node.lhs.type.equals(CHAR)&&node.rhs.type.equals(CHAR))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT))){
			node.type=BOOL;
		}
		else if(node.lhs.type.equals(BOOL)&&node.rhs.type.equals(BOOL)){
			node.type=BOOL;
		}
		else if (!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else{
			System.out.println("Type error found: Incorrect types used with equal to operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(GreaterThanEqualExprNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(INT))||(node.lhs.type.equals(CHAR)&&node.rhs.type.equals(CHAR))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT))){
			node.type=BOOL;
		}
		else if(node.lhs.type.equals(BOOL)&&node.rhs.type.equals(BOOL)){
			System.out.println("Type error found: Greater than or equal expression used to compare boolean values.");
		}
		else if (!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else{
			System.out.println("Type error found: Incorrect types used with greater than or equal operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(GreaterThanExprNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(INT))||(node.lhs.type.equals(CHAR)&&node.rhs.type.equals(CHAR))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT))){
			node.type=BOOL;
		}
		else if(node.lhs.type.equals(BOOL)&&node.rhs.type.equals(BOOL)){
			System.out.println("Type error found: Greater than expression used to compare boolean values.");
		}
		else if (!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else{
			System.out.println("Type error found: Incorrect types used with greater than operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(InExprNode node) {
		if (node.lhs != null) {
			node.lhs.accept(this);
		}
		if (node.rhs != null) {
			node.lhs.accept(this);
		}
		if(node.rhs.type.contains(LIST)){
			if(node.rhs.type.contains(node.lhs.type))
				node.type=BOOL;
			else
				System.out.println("Type error found: List does not include "+ node.lhs.type+".");
				
		}
		else if(node.rhs.type.contains(TUPLE)){
			if(node.rhs.type.contains(node.lhs.type))
				node.type=BOOL;
			else
				System.out.println("Type error found: Tuple does not include "+ node.lhs.type+".");
		}
		else if(node.rhs.type.equals(STRING)){
			if(node.lhs.type.equals(CHAR))
				node.type=BOOL;
			else
				System.out.println("Type error found: Searching string for " + node.lhs.type);
		}
		else{
			System.out.println("Type error found: Operation In used on a type other than List, Tuple or String.");
		}

		return null;
	}

	@Override
	public Boolean visit(LessThanEqualExprNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(INT))||(node.lhs.type.equals(CHAR)&&node.rhs.type.equals(CHAR))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT))){
			node.type=BOOL;
		}
		else if(node.lhs.type.equals(BOOL)&&node.rhs.type.equals(BOOL)){
			System.out.println("Type error found: Less than or equal expression used to compare boolean values.");
		}
		else if (!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else{
			System.out.println("Type error found: Incorrect types used with less than or equal operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(LessThanExprNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(INT))||(node.lhs.type.equals(CHAR)&&node.rhs.type.equals(CHAR))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT))){
			node.type=BOOL;
		}
		else if(node.lhs.type.equals(BOOL)&&node.rhs.type.equals(BOOL)){
			System.out.println("Type error found: Less than expression used to compare boolean values.");
		}
		else if (!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else{
			System.out.println("Type error found: Incorrect types used with less than operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(MinusExprNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(FLOAT))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(INT))){
			node.type=FLOAT;
		}
		else if(node.lhs.type.equals(INT)&&node.rhs.type.equals(INT)){
			node.type=INT;
		}
		else if(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT)){
			node.type=FLOAT;
		}
		else if(!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else {
			System.out.println("Type error found: Incorrect types for subtraction operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(NotEqualExprNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(INT))||(node.lhs.type.equals(CHAR)&&node.rhs.type.equals(CHAR))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT))){
			node.type=BOOL;
		}
		else if(node.lhs.type.equals(BOOL)&&node.rhs.type.equals(BOOL)){
			node.type=BOOL;
		}
		else if (!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else{
			System.out.println("Type error found: Incorrect types used with not equal operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(OrExprNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if(node.lhs.type.equals(BOOL)&&node.rhs.type.equals(BOOL)){
			node.type=BOOL;
		}
		else if (!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else{
			System.out.println("Type error found: Incorrect types for or operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(PlusExprNode node) {
		if(node.lhs != null){
			node.lhs.accept(this);
		}
		if(node.rhs != null){
			node.rhs.accept(this);
		}
		if((node.lhs.type.equals(INT)&&node.rhs.type.equals(FLOAT))||(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(INT))){
			node.type=FLOAT;
		}
		else if(node.lhs.type.equals(INT)&&node.rhs.type.equals(INT)){
			node.type=INT;
		}
		else if(node.lhs.type.equals(FLOAT)&&node.rhs.type.equals(FLOAT)){
			node.type=FLOAT;
		}
		else if(!node.lhs.type.equals(node.rhs.type)){
			System.out.println("Type error found: "+ node.lhs.type +" does not match "+node.rhs.type);
		}
		else {
			System.out.println("Type error found: Incorrect types for addition operation.");
		}
		return null;
	}

	@Override
	public Boolean visit(ListSeqNode node) {
		List<ExprNode> exprs = node.exprList.el.expressions;
		ExprNode firstElem = exprs.get(0);
		firstElem.accept(this);
		String prevNode = firstElem.type;
		for(ExprNode e: exprs){
			e.accept(this);
			if(!prevNode.equals(e.type))
			{
				System.out.println("List Type Error: List contains "+e.type+" and "+prevNode);
				prevNode = null;
				break; 
			}
			prevNode = e.type;		
		}
		node.type = "LIST"+prevNode;
		return null;	
	}

	@Override
	public Boolean visit(TupleSeqNode node) {
		List<ExprNode> exprs = node.exprList.el.expressions;
		String tupleListType = null;
		for(ExprNode e: exprs){
			e.accept(this);
			tupleListType += e.type + ',';		
		}
		node.type = "TUPLE:"+tupleListType;
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
		for (GlobalDeclNode child : node.statements) {
			child.accept(this);
		}
		return null;
	}

	@Override
	public Boolean visit(LocalDeclListNode node) {
		for (VarDeclNode child : node.varDecls) {
			child.accept(this);
		}
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

		if (node.vt != null) {
			node.vt.accept(this);
		}
		if (node.vi != null) {
			node.vi.accept(this);
		}

		if (!node.vt.type.equals(node.vi.type)) {
			System.out.println("Invalid variable declaration for variable "
					+ node.vt.id + ".");
			numberOfErrors++;
		}

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

	@Override
	public Object visit(DataTypeDeclNode node) {
		return null;
	}

	@Override
	public Object visit(VarTypeNode node) {
		Symbol symbol = new Symbol();
		symbol.setId(node.id);

		List<String> types = new ArrayList<String>();
		types.add(node.type);
		symbol.setKind(Kind.VAR);

		node.type = types.get(0);

		if (!table.put(symbol)) {
			numberOfErrors++;
		}

		return null;
	}

	@Override
	public Object visit(VarInitNode node) {
		if (node.el != null) {
			node.el.accept(this);
		}
		node.type = node.el.type;
		return null;
	}

	@Override
	public Object visit(AccessNode node) {
		List<IdNode> ids = node.ids;
		if(ids!=null){
		IdNode lastAccessor = ids.get(ids.size()-1);
		lastAccessor.accept(this);
		}
		return null;
	}

}
