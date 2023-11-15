package Sai;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical AND (&&)
        boolean condition1 = true;
        boolean condition2 = false;

        if (condition1 && condition2) {
            System.out.println("Both conditions are true");
        } else {
            System.out.println("At least one condition is false");
        }

        // Logical OR (||)
        boolean condition3 = true;
        boolean condition4 = false;

        if (condition3 || condition4) {
            System.out.println("At least one condition is true");
        } else {
            System.out.println("Both conditions are false");
        }

        // Logical NOT (!)
        boolean condition5 = true;

        if (!condition5) {
            System.out.println("Condition is false");
        } else {
            System.out.println("Condition is true");
        }
    }
}
