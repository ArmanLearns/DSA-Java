import java.util.*;

class LinearSearch {

    // Returns the index of key if found, else -1
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;       // found — return position immediately
            }
        }
        return -1;              // not found after scanning whole array
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 7, 10, 11, 19};
        int key = 9;

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}

// Time Complexity: O(n) — worst case scans every element
// Space Complexity: O(1) — no extra space used