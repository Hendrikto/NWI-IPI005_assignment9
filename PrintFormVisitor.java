package assignment9;

/**
 * An implementation of the FormVisitor interface that converts a Form to a
 * String.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class PrintFormVisitor implements FormVisitor<Void> {

    private final StringBuilder buffer = new StringBuilder();

    /**
     * @return a String representation of the visited Form
     */
    public String getString() {
        return buffer.toString();
    }

    /**
     * Visit a BinaryOperatorForm.
     *
     * @param form the BinaryOperatorForm to visit
     * @return Void
     */
    @Override
    public Void visit(BinaryOperatorForm form) {
        boolean parenthesesLeft = form.getPriority() <= form.getLeftOperand().getPriority();
        boolean parenthesesRight = form.getPriority() <= form.getRightOperand().getPriority();
        if (parenthesesLeft) {
            this.buffer.append('(');
        }
        form.getLeftOperand().accept(this);
        if (parenthesesLeft) {
            this.buffer.append(')');
        }
        this.buffer.append(form.getOperation());
        if (parenthesesRight) {
            this.buffer.append('(');
        }
        form.getRightOperand().accept(this);
        if (parenthesesRight) {
            this.buffer.append(')');
        }
        return null;
    }

    /**
     * Visit a TrueForm.
     *
     * @param form the TrueForm to visit
     * @return Void
     */
    @Override
    public Void visit(TrueForm form) {
        this.buffer.append("true");
        return null;
    }

    /**
     * Visit a FalseForm.
     *
     * @param form the FalseForm to visit
     * @return Void
     */
    @Override
    public Void visit(FalseForm form) {
        this.buffer.append("false");
        return null;
    }

    /**
     * Visit a NotForm.
     *
     * @param form the NotForm to visit
     * @return Void
     */
    @Override
    public Void visit(NotForm form) {
        boolean parentheses = form.getPriority() <= form.getOperand().getPriority();
        this.buffer.append('~');
        if (parentheses) {
            this.buffer.append('(');
        }
        form.getOperand().accept(this);
        if (parentheses) {
            this.buffer.append(')');
        }
        return null;
    }

    /**
     * Visit a AtomicForm.
     *
     * @param form the AtomicForm to visit
     * @return Void
     */
    @Override
    public Void visit(AtomicForm form) {
        this.buffer.append(form.getName());
        return null;
    }

}
