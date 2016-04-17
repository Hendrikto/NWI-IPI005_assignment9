package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class NotForm implements Form {

    private final Form operand;

    public NotForm(Form op) {
        this.operand = op;
    }

    /**
     * @return the operand
     */
    public Form getOperand() {
        return operand;
    }

    @Override
    public <T> T accept(FormVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public int getPriority() {
        return 0;
    }

}
