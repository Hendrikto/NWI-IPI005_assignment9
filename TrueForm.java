package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class TrueForm implements Form {

    @Override
    public <T> T accept(FormVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public int getPriority() {
        return -1;
    }

}
