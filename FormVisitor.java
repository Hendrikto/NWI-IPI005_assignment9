package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public interface FormVisitor<T> {

    public T visit(BinaryOperatorForm form);

    public T visit(TrueForm form);

    public T visit(FalseForm form);

    public T visit(NotForm form);

    public T visit(AtomicForm form);

}
