package assignment9;

/**
 * A true formula.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class TrueForm implements Form {

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
        return -1;
    }

}
