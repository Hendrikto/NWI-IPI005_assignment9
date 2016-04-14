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

    @Override
    public void accept(FormVisitor visitor) {
        visitor.visit(this);
    }

}
