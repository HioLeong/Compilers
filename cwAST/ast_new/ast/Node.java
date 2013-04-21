package ast;

import visitor.Visitor;

/**
 * The root of the inheritance hierarchy. Every node in our AST is a Node.
 * Since there are no inherited defintions from the class Node, one might
 * as well use an interface.
 */
public abstract class Node  {
	
	public abstract Object accept(Visitor visitor);
	
}
