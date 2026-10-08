package other;

public class Fibbonacci {

    /**
     * Recursive method to calculate the nth Fibonacci number
     * @param n the position in the Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive case: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
