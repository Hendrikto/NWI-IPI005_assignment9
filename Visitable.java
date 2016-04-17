package assignment9;

/**
 * An interface for accepting FormVisitors.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public interface Visitable {

    /**
     * Accept a FormVisitor.
     *
     * @param <T> the return type
     * @param visitor the FormVisitor to accept
     * @return relayed return value of visitor.accept(this)
     */
    public <T> T accept(FormVisitor<T> visitor);

}
