package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class PrintFormVisitor implements FormVisitor<Void> {

    private final StringBuilder buffer = new StringBuilder();

    public String getString() {
        return buffer.toString();
    }

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

    @Override
    public Void visit(TrueForm form) {
        this.buffer.append("true");
        return null;
    }

    @Override
    public Void visit(FalseForm form) {
        this.buffer.append("false");
        return null;
    }

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

    @Override
    public Void visit(AtomicForm form) {
        this.buffer.append(form.getName());
        return null;
    }

}
