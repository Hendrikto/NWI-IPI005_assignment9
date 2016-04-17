package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public enum BinaryOperator {
    AND("/\\", 1) {
        public boolean apply(boolean a, boolean b) {
            return a && b;
        }
    },
    OR("\\/", 2) {
        public boolean apply(boolean a, boolean b) {
            return a || b;
        }
    },
    IMPLICATION("->", 3) {
        public boolean apply(boolean a, boolean b) {
            return !a || b;
        }
    };

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

    public abstract boolean apply(boolean a, boolean b);

}
