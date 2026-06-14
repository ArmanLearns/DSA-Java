/**
 * Factorial algorithm for DSA practice.
 * Calculates n! iteratively.
 *
 * @author Arman Gautam
 */
public class Factorials {

    /**
     * Find Factorial
     * Calculates the factorial of n (n!) using a loop.
     * Note: Java's long overflows beyond 20! — use BigInteger for larger n.
     * Time Complexity: O(n)
     */
    public static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid input: negative number.");
            return -1;
        }

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("--- FACTORIAL METHOD ---");
        System.out.println("Factorial of 5 is: " + calculateFactorial(5));
        System.out.println("Factorial of 10 is: " + calculateFactorial(10));
        System.out.println("Factorial of 0 is: " + calculateFactorial(0));
    }
}