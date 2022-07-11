/**
 * LeetCode 309.最佳买卖股票时机含冷冻期
 * Best Time to Buy and Sell Stock with Cooldown
 */
public class Solution_309 {
    public int maxProfit(int[] prices) {
        int length = prices.length;

        if (length < 2) {
            return 0;
        }

        int[][] dp = new int[length][3];
        dp[0][0] = -1 * prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;

        for (int i = 1; i < length; i++) {
            // the maximum profit so far with a stock(or buy a stock)
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2] - prices[i]);

            // sold a stock and in the cooldown
            dp[i][1] = dp[i-1][0] + prices[i];

            // the maximum profit so far without a stock and not in the cooldown
            dp[i][2] = Math.max(dp[i-1][1], dp[i-1][2]);
        }

        int maxProfit = Math.max(dp[length-1][1], dp[length-1][2]);
        return maxProfit;
    }
}
