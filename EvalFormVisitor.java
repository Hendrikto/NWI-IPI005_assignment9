package assignment9;

import java.util.Map;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class EvalFormVisitor implements FormVisitor<Boolean> {

    private final Map<String, Boolean> environment;

    public EvalFormVisitor(Map<String, Boolean> env) {
        this.environment = env;
    }

    @Override
    public Boolean visit(BinaryOperatorForm form) {
        return form.getOperation().apply(
                form.getLeftOperand().accept(this),
                form.getRightOperand().accept(this)
        );
    }

    @Override
    public Boolean visit(TrueForm form) {
        return true;
    }

    @Override
    public Boolean visit(FalseForm form) {
        return false;
    }

    @Override
    public Boolean visit(NotForm form) {
        return !form.accept(this);
    }

    @Override
    public Boolean visit(AtomicForm form) {
        return this.environment.get(form.getName());
    }

    @Override
    public String getString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
