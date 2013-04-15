package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class DivideTermNode extends TermNode {

    public DivideTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }
}
