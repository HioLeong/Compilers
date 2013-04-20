package ast;

import java.util.List;

/**
 * Alternatively, one could use this class to implement a singly-linked list.
 */
public class ParameterListSNode extends Node {

    // instead of public visibility, rather use a method to access
    // this attribute
    public List<VarTypeNode> parameters;

    public ParameterListSNode(List<VarTypeNode> parameters) {
        this.parameters = parameters;
    }  


}
