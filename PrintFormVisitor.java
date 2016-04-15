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
    }

    @Override
    public void visit(TrueForm form) {
        this.buffer.append("true");
    }

    @Override
    public void visit(FalseForm form) {
        this.buffer.append("false");
    }

    @Override
    public void visit(NotForm form) {
        boolean parentheses = form.getPriority() <= form.getOperand().getPriority();
        this.buffer.append('~');
        if (parentheses) {
            this.buffer.append('(');
        }
        form.getOperand().accept(this);
        if (parentheses) {
            this.buffer.append(')');
        }
    }

    @Override
    public void visit(AtomicForm form) {
        this.buffer.append(form.getName());
    }

}
