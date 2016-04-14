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

    @Override
    public void accept(FormVisitor visitor) {
        visitor.visit(this);
    }

}
