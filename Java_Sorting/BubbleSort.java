public class BubbleSort {

    // Bubble Sort — repeatedly swap adjacent elements if out of order
    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false;   // track if any swap happened this pass

            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no swaps in this pass, array is already sorted — stop early
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8, 3, 7};
        bubbleSort(arr);
        printArray(arr);
    }
}

// Time Complexity: O(n^2) worst/average — O(n) best case (already sorted, early exit)
// Space Complexity: O(1) — sorted in place