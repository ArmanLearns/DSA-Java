public class kadanesSubarrays {

    // Kadane's Algorithm — O(n) — finds max & min subarray sum
    public static void kadanes(int[] numbers) {

        // --- MAX subarray sum ---
        int ms = Integer.MIN_VALUE;   // best max so far (start lowest, NOT 0)
        int cs = 0;                   // current running sum
        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];
            ms = Math.max(ms, cs);    // capture BEFORE reset (only once)
            if (cs < 0) {
                cs = 0;               // negative running sum hurts a max, reset
            }
        }

        // --- MIN subarray sum ---
        int minSum = Integer.MAX_VALUE;   // best min so far (start highest)
        int curr = 0;                     // current running sum
        for (int i = 0; i < numbers.length; i++) {
            curr += numbers[i];
            minSum = Math.min(minSum, curr);   // capture BEFORE reset
            if (curr > 0) {
                curr = 0;             // positive running sum hurts a min, reset
            }
        }

        System.out.println("Max Subarray Sum: " + ms);
        System.out.println("Min Subarray Sum: " + minSum);


    }    public static void main(String[] args) {
        int[] numbers = { -2, -3, -4, -1, -2, -3 };
        kadanes(numbers);
    }
}

/* COMPLEXITY:
   Time:  O(n) — two single (un-nested) loops
   Space: O(1) — only a few variables, no extra arrays
*/