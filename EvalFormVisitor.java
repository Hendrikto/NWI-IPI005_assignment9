package assignment9;

import java.util.Map;

/**
 * An implementation of the FormVisitor interface that evaluates a Form given a
 * Map of values for its AtomicForms.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class EvalFormVisitor implements FormVisitor<Boolean> {

    private final Map<String, Boolean> environment;

    /**
     * Constructor method.
     *
     * @param env a Map op values of the AtomicForms
     */
    public EvalFormVisitor(Map<String, Boolean> env) {
        this.environment = env;
    }

    /**
     * Evaluate a binary operation.
     *
     * @param form the binary operation to evaluate
     * @return the evaluation of the binary operation
     */
    @Override
    public Boolean visit(BinaryOperatorForm form) {
        return form.getOperation().apply(
                form.getLeftOperand().accept(this),
                form.getRightOperand().accept(this)
        );
    }

    /**
     * Evaluate a true formula.
     *
     * @param form the true formula to evaluate
     * @return true
     */
    @Override
    public Boolean visit(TrueForm form) {
        return true;
    }

    /**
     * Evaluate a false formula.
     *
     * @param form the false formula to evaluate
     * @return false
     */
    @Override
    public Boolean visit(FalseForm form) {
        return false;
    }

    /**
     * Evaluate a negation.
     *
     * @param form the negation to evaluate
     * @return the inverse boolean value of the operand of the negation
     */
    @Override
    public Boolean visit(NotForm form) {
        return !form.getOperand().accept(this);
    }

    /**
     * Evaluate an atomic formula.
     *
     * @param form the atomic formula to evaluate
     * @return a boolean based on the map of values
     */
    @Override
    public Boolean visit(AtomicForm form) {
        return this.environment.get(form.getName());
    }

}
