package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public abstract class MultiplyTermNode extends TermNode {

    public MultiplyTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }
}