package ast;
import java.util.List;

import visitor.Visitor;

public class AccessNode extends Node {

    public List<IdNode> ids; 

    public AccessNode(List<IdNode> ids) {
        this.ids = ids;
    }

	@Override
	public Object accept(Visitor visitor) {
		visitor.visit(this);
		return null;
	}
}
