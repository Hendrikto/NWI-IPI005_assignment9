package assignment9;

/**
 * A negation.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class NotForm implements Form {

    private final Form operand;

    /**
     * Constructor method.
     *
     * @param op the operand
     */
    public NotForm(Form op) {
        operand = op;
    }

    /**
     * @return the operand
     */
    public Form getOperand() {
        return operand;
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
     * @return the priority of this Form
     */
    @Override
    public int getPriority() {
        return 0;
    }

}
