class PrintPairs {

    // Prints all unique pairs in the array
    public static void printPairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            // j starts at i+1 so each pair is counted once (no duplicates, no self-pairs)
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}

// Time Complexity: O(n^2) — nested loops form roughly n*(n-1)/2 pairs
// Space Complexity: O(1) — no extra space used (output not counted)