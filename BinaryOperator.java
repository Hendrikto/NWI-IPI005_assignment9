package assignment9;

/**
 * The binary operators.
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

    /**
     * Constructor method.
     *
     * @param op a String representation of the binary operator
     * @param prio the priority of the binary operator
     */
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

    /**
     * @return s String representation of this BinaryOperator
     */
    @Override
    public String toString() {
        return this.operation;
    }

    /**
     * Apply this binary operator to two boolean values.
     *
     * @param a first operand
     * @param b second operand
     * @return this binary operator applied to the arguments
     */
    public abstract boolean apply(boolean a, boolean b);

}
