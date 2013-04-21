package visitor;

import ast.*;
import ast.term.MultiplyTermNode;

public interface Visitor {
	
	public boolean visit(BlockNode node);
	
	public boolean visit(MultiplyTermNode node);

}
