/**
 * This class represents a simple calculator.
 * It can perform addition, subtraction, multiplication, and division operations.
 */
public class Calculator {


    /**
     * Adds two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The difference between a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integers.
     *
     * @param a The dividend
     * @param b The divisor (must be non-zero)
     * @return The result of dividing a by b
     * @throws ArithmeticException if b is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }

    /**
     * Main method to run the calculator.
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Perform some calculations and print the results
        int result1 = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result1);

        int result2 = calculator.subtract(10, 4);
        System.out.println("10 - 4 = " + result2);

        int result3 = calculator.multiply(7, 2);
        System.out.println("7 * 2 = " + result3);

        double result4 = calculator.divide(15, 5);
        System.out.println("15 / 5 = " + result4);
    }
}
