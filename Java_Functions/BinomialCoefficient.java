/**
 * Binomial Coefficient (nCr) algorithm for DSA practice.
 * Calculates combinations using factorials.
 *
 * @author Arman Gautam
 */
public class BinomialCoefficient {

    /**
     * Helper: Calculates factorial of n (n!).
     * Time Complexity: O(n)
     */
    public static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    /**
     * Find Binomial Coefficient (nCr)
     * Uses the formula: n! / (r! * (n - r)!)
     * Time Complexity: O(n)
     */
    public static long calculateNCR(int n, int r) {
        if (n < r || n < 0 || r < 0) {
            System.out.println("Invalid input: n must be >= r and both non-negative.");
            return 0;
        }

        long factN = calculateFactorial(n);
        long factR = calculateFactorial(r);
        long factNMinusR = calculateFactorial(n - r);

        return factN / (factR * factNMinusR);
    }

    public static void main(String[] args) {
        System.out.println("--- BINOMIAL COEFFICIENT (nCr) ---");
        System.out.println("5C2 = " + calculateNCR(5, 2));
        System.out.println("10C3 = " + calculateNCR(10, 3));
        System.out.println("6C0 = " + calculateNCR(6, 0));
    }
}