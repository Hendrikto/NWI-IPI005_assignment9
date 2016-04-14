package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class AtomicForm implements Form {

    private final String name;

    public AtomicForm(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public void accept(FormVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object a) {
        if (this.getClass() == a.getClass()) {
            return this.name.equals(((AtomicForm) a).getName());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int getPriority() {
        return -1;
    }

}
