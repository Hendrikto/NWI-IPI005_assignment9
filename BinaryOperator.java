package assignment9;

/**
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public enum BinaryOperator {
    AND("/\\"), OR("\\/"), IMPLICATION("->");

    private final String operation;

    private BinaryOperator(String op) {
        this.operation = op;
    }

    @Override
    public String toString() {
        return this.operation;
    }

}
