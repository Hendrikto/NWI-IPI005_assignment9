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
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean visit(AtomicForm form) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
