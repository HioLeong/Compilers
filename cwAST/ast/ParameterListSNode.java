package ast;

import java.util.List;

/**
 * Alternatively, one could use this class to implement a singly-linked list.
 */
public class ParameterListSNode extends Node {

    // instead of public visibility, rather use a method to access
    // this attribute
    public List<VarTypeNode> varTypes;

    public ParameterListSNode(List<VarTypeNode> varTypes) {
        this.varTypes = varTypes;
    }  


}
