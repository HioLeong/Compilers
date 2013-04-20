package ast;

/**
 * For this class, an interface would not make much sense any more. ;)
 */
public class MultiplyTermNode extends BinaryTermNode {

    public MultiplyTermNode(TermNode lhs, FactorNode rhs) {
        super(lhs,rhs);
    }
}
