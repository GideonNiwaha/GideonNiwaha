public class DivisionExercise {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result;

        try {
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution of try-catch block is complete.");
        }
    }
}