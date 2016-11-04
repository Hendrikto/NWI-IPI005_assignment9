package assignment9;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains the main method.
 *
 * @author Hendrik Werner // s4549775
 * @author Jasper Haasdijk // s4449754
 */
public class Assignment9 {

    /**
     * Entry point
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Form f = generateForm(1);
        PrintFormVisitor v = new PrintFormVisitor();
        Map<String, Boolean> env = new HashMap<>();
        env.put("A", false);
        env.put("B", true);
        env.put("C", false);
        FormVisitor e = new EvalFormVisitor(env);
        f.accept(v);
        System.out.println(v.getString());
        System.out.printf("Evaluation: %b%n", f.accept(e));
    }

    /**
     * Generate formulas for testing.
     *
     * @param select selects the formula that is generated
     * @return a formula based on the select argument
     */
    public static Form generateForm(int select) {
        switch (select) {
            case 1:
                return new BinaryOperatorForm(
                        BinaryOperator.IMPLICATION,
                        new BinaryOperatorForm(
                                BinaryOperator.AND,
                                new AtomicForm("A"),
                                new BinaryOperatorForm(
                                        BinaryOperator.OR,
                                        new TrueForm(),
                                        new FalseForm()
                                )
                        ),
                        new NotForm(
                                new BinaryOperatorForm(
                                        BinaryOperator.AND,
                                        new AtomicForm("A"),
                                        new AtomicForm("B")
                                )
                        )
                );
            default:
                return new BinaryOperatorForm(
                        BinaryOperator.IMPLICATION,
                        new AtomicForm("A"),
                        new BinaryOperatorForm(
                                BinaryOperator.IMPLICATION,
                                new AtomicForm("B"),
                                new AtomicForm("C")
                        )
                );
        }
    }

}
