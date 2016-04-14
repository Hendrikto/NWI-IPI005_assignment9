package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public enum BinaryOperator {
    AND("/\\", 1), OR("\\/", 2), IMPLICATION("->", 3);

    private final String operation;
    private final int priority;

    private BinaryOperator(String op, int prio) {
        this.operation = op;
        this.priority = prio;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return this.operation;
    }

}
