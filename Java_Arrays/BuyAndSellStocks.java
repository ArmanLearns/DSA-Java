public class BuyAndSellStocks {

    // Best time to buy and sell stock — O(n) single pass
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;   // cheapest day so far (start highest)
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;   // sell today
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];   // found a cheaper day to buy
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}

// Time Complexity: O(n) — single pass through prices
// Space Complexity: O(1) — only two variables