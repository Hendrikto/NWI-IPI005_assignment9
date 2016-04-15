package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public interface FormVisitor {

    void visit(BinaryOperatorForm form);

    void visit(TrueForm form);

    void visit(FalseForm form);

    void visit(NotForm form);

    void visit(AtomicForm form);

    public String getString();

}
