package ast;

public class AndTermNode extends TermNode {

    public AndTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }
}
