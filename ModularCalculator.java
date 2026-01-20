/**
 * Modular Calculator Application
 * Demonstrates method design, overloading, exception handling,
 * pass-by-value, and reusable utility methods.
 */
public class ModularCalculator {

    public static void main(String[] args) {

        int a = 20, b = 5;
        double x = 10.5, y = 2.5;

        System.out.println("=== Integer Operations ===");
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));

        System.out.println("\n=== Double Operations (Method Overloading) ===");
        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));

        System.out.println("\n=== Utility Method ===");
        printLine();

        System.out.println("\n=== Pass By Value Demo ===");
        int number = 10;
        System.out.println("Before method call: " + number);
        changeValue(number);
        System.out.println("After method call: " + number);
    }

    /** Adds two integers */
    public static int add(int a, int b) {
        return a + b;
    }

    /** Adds two double values (Overloaded method) */
    public static double add(double a, double b) {
        return a + b;
    }

    /** Subtracts two integers */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /** Subtracts two double values */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /** Multiplies two integers */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /** Multiplies two double values */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides two integers with exception handling
     * @throws ArithmeticException if divisor is zero
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /** Divides two double values */
    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /** Reusable utility method */
    public static void printLine() {
        System.out.println("------------------------------");
    }

    /**
     * Demonstrates pass-by-value in Java
     * Value will not change outside the method
     */
    public static void changeValue(int num) {
        num = 50;
        System.out.println("Inside method: " + num);
    }
}
