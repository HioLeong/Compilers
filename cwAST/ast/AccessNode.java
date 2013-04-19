package ast;

public class AccessNode extends Node {

    public List<IdNode> ids; 

    public AccessNode(List<IdNode> ids) {
        this.ids = ids;
    }
}
