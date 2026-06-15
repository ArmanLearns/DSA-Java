class LargestInArray {

    // Returns the largest value in the array
    public static int getLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;        // start lower than any possible value

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];           // found a bigger value — update
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 7, 9};
        System.out.println("Largest Number: " + getLargest(numbers));
    }
}

// Time Complexity: O(n) — single pass through the array
// Space Complexity: O(1) — only one variable tracks the max