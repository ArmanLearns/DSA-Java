class MaxPrefixsubarrays {

    // Prints every subarray along with its sum, plus a total count
    public static void maxSubarraySum(int[] numbers) {

        int prefix[] = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;

        // create prefix array
        for (int i = 0; i < prefix.length; i++) {
            if (i == 0) {
                prefix[i] = numbers[i];
            } else {
                prefix[i] = prefix[i - 1] + numbers[i];
            }
        }
        // outer loop to get start index
        for (int i = 0; i < numbers.length; i++) { // start index
            int start = i;
            // inner loop to get end index
            for (int j = i; j < numbers.length; j++) { // end index
                int end = j;
                int sum = 0;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // check if sum is greater than max sum
                if (maxSum < sum) {
                    maxSum = sum;
                }

                // one subarray completed
            }
            System.out.println();
        }

        System.out.println("Max Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, -2, 6, -1, 3 };
        maxSubarraySum(numbers);
    }
}

// Time Complexity: O(n^2) — two nested loops
// Space Complexity: O(1) — no extra space (output not counted)