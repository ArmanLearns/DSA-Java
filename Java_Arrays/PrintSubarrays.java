class PrintSubarrays {

    // Prints every subarray along with its sum, plus a total count
    public static void printSubarrays(int[] numbers) {
        int totalSubarrays = 0;

        for (int i = 0; i < numbers.length; i++) {       // start index
            int start = i;
            for (int j = i; j < numbers.length; j++) {   // end index
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {     // walk the subarray
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }

                System.out.println("| Sum: " + sum);
                totalSubarrays++;                        // one subarray completed
            }
            System.out.println();
        }

        System.out.println("Total Subarrays: " + totalSubarrays);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}

// Time Complexity: O(n^3) — three nested loops
// Space Complexity: O(1) — no extra space (output not counted)