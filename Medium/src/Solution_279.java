/**
 * LeetCode 279.完全平方数
 * Perfect Squares
 */
public class Solution_279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            int minSqrt = Integer.MAX_VALUE;

            for (int j = 1; j*j <= i; j++) {
                minSqrt = Math.min(minSqrt, dp[i-j*j]);
            }

            dp[i] = minSqrt + 1;
        }

        return dp[n];
    }
}
