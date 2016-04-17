package assignment9;

/**
 * A binary operation consisting of a BinaryOperator and two Form operands.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class BinaryOperatorForm implements Form {

    private final BinaryOperator operation;
    private final Form leftOperand;
    private final Form rightOperand;

    /**
     * Constructor method.
     *
     * @param op the BinaryOperator
     * @param l the first operand
     * @param r the second operand
     */
    public BinaryOperatorForm(BinaryOperator op, Form l, Form r) {
        this.operation = op;
        this.leftOperand = l;
        this.rightOperand = r;
    }

    /**
     * @return the leftOperand
     */
    public Form getLeftOperand() {
        return leftOperand;
    }

    /**
     * @return the rightOperand
     */
    public Form getRightOperand() {
        return rightOperand;
    }

    /**
     * @return the operation
     */
    public BinaryOperator getOperation() {
        return operation;
    }

    /**
     * Accept a Visitor.
     *
     * @param <T> the return type
     * @param visitor the Visitor to accept
     * @return relayed return value of visitor.visit(this)
     */
    @Override
    public <T> T accept(FormVisitor<T> visitor) {
        return visitor.visit(this);
    }

    /**
     * @return the priority
     */
    @Override
    public int getPriority() {
        return this.operation.getPriority();
    }

}
