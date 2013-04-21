package ast.term;

import ast.FactorNode;


public class DivideTermNode extends BinaryTermNode {

    public DivideTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }
}
