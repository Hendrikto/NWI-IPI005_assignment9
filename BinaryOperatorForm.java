package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class BinaryOperatorForm implements Form {

    private final BinaryOperator operation;
    private final Form leftOperand;
    private final Form rightOperand;

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

    @Override
    public <T> T accept(FormVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public int getPriority() {
        return this.operation.getPriority();
    }

}
