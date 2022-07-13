/**
 * LeetCode 494.目标和
 * Target Sum
 */
public class Solution_494 {
    public int findTargetSumWays(int[] nums, int target) {
        int length = nums.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += nums[i];
        }

        int difference = sum - target;

        if (difference < 0 || difference % 2 == 1) {
            return 0;
        }

        int negative = difference / 2;

        int[][] dp = new int[length+1][negative+1];

        dp[0][0] = 1;
        for (int i = 1; i < length+1; i++) {
            for (int j = 0; j< negative+1; j++) {
                dp[i][j] = dp[i-1][j];

                if(j >= nums[i-1]) {
                    dp[i][j] += dp[i-1][j-nums[i-1]];
                }
            }
        }

        return dp[length][negative];
    }
}
