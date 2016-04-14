package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class FalseForm implements Form {

    @Override
    public void accept(FormVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getPriority() {
        return -1;
    }

}
