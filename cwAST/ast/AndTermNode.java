package ast;

public class AndTermNode extends BinaryTermNode {

    public AndTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }
}
