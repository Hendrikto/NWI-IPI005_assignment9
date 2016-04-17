package assignment9;

/**
 * An interface for representing logical formulas. An extension of the Visitable
 * interface.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public interface Form extends Visitable {

    /**
     * Get the priority of this formula.
     *
     * @return the priority of this formula
     */
    public int getPriority();

}
