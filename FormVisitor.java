package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public interface FormVisitor {

    public void visit(BinaryOperatorForm form);

    public void visit(TrueForm form);

    public void visit(FalseForm form);

    public void visit(NotForm form);

    public void visit(AtomicForm form);

    public String getString();

}
