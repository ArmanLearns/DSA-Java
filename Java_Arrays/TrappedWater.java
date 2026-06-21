public class TrappedWater {

    // Trapping Rainwater using prefix arrays (auxiliary arrays approach)
    public static int trappedWater(int[] height) {
        int n = height.length;

        // leftMax[i] = tallest bar from start up to index i
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // rightMax[i] = tallest bar from end down to index i
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // water on each bar = min(leftMax, rightMax) - bar's own height
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            totalWater += (waterLevel - height[i]);
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total Trapped Water: " + trappedWater(height));
    }
}

// Time Complexity: O(n) — three separate single loops
// Space Complexity: O(n) — two extra arrays (leftMax, rightMax)