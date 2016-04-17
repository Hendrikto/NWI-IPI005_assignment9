package assignment9;

/**
 * An atomic formula.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class AtomicForm implements Form {

    private final String name;

    /**
     * Constructor method.
     *
     * @param name
     */
    public AtomicForm(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
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
        return -1;
    }

}
