package ast.term;

import ast.FactorNode;

public class AndTermNode extends BinaryTermNode {

    public AndTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }
}
