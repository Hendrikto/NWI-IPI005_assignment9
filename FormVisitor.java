package assignment9;

/**
 * An interface for a Visitor that visits formulas.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public interface FormVisitor<T> {

    /**
     * Visit a BinaryOperatorForm.
     *
     * @param form the BinaryOperatorForm to visit
     * @return something of type T
     */
    public T visit(BinaryOperatorForm form);

    /**
     * Visit a TrueForm.
     *
     * @param form the TrueForm to visit
     * @return something of type T
     */
    public T visit(TrueForm form);

    /**
     * Visit a FalseForm.
     *
     * @param form the FalseForm to visit
     * @return something of type T
     */
    public T visit(FalseForm form);

    /**
     * Visit a NotForm.
     *
     * @param form the NotForm to visit
     * @return something of type T
     */
    public T visit(NotForm form);

    /**
     * Visit a AtomicForm.
     *
     * @param form the AtomicForm to visit
     * @return something of type T
     */
    public T visit(AtomicForm form);

}
