/**
 * Prime Number algorithms for DSA practice.
 * Includes brute force, optimized, and range-printing methods.
 *
 * @author Arman Gautam
 */
public class PrimeNumbers {

    /**
     * 1. Brute Force Method
     * Checks all divisors from 2 up to n-1.
     * Time Complexity: O(n)
     */
    public static boolean isPrimeBruteForce(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 2. Optimized Method
     * Checks divisors only up to sqrt(n), since larger factors
     * always pair with a smaller one below sqrt(n).
     * Time Complexity: O(sqrt(n))
     */
    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        // i * i <= n avoids the floating-point cost of Math.sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 3. Print Primes in a Range
     * Prints all primes within [start, end] using the optimized check.
     * Time Complexity: O(m * sqrt(n)) where m = range size
     */
    public static void printPrimesInRange(int start, int end) {
        System.out.print("Primes between " + start + " and " + end + ": ");
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrimeOptimized(i)) { // Reusing the optimized helper
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal primes found: " + count);
    }

    public static void main(String[] args) {
        System.out.println("--- PRIME NUMBER METHODS ---");
        System.out.println("Is 29 prime (Brute Force)? " + isPrimeBruteForce(29));
        System.out.println("Is 37 prime (Optimized)? " + isPrimeOptimized(37));
        printPrimesInRange(10, 50);
    }
}