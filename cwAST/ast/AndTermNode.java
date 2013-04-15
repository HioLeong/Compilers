package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class AndTermNode extends TermNode {

    public AndTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }
}
