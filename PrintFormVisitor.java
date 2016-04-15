package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class PrintFormVisitor implements FormVisitor {

    private final StringBuilder buffer = new StringBuilder();

    public String getString() {
        return buffer.toString();
    }

    @Override
    public void visit(BinaryOperatorForm form) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visit(TrueForm form) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visit(FalseForm form) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visit(NotForm form) {
        boolean parentheses = form.getPriority() < form.getOperand().getPriority();
        this.buffer.append('~');
        if (parentheses) {
            this.buffer.append('(');
        }
        form.accept(this);
        if (parentheses) {
            this.buffer.append(')');
        }
    }

    @Override
    public void visit(AtomicForm form) {
        this.buffer.append(form.getName());
    }

}
