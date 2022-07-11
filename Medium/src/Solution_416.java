/**
 * LeetCode 416.分割等和子集
 * Partition Equal Subset Sum
 */
public class Solution_416 {
    public boolean canPartition(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return false;
        }

        int sum = 0;
        int maxNum = 0;

        for (int i = 0; i < length; i++) {
            sum += nums[i];
            maxNum = Math.max(nums[i], maxNum);
        }

        if (sum % 2 != 0) {
            return false;
        }

        if (maxNum > sum/2) {
            return false;
        }

        boolean[][] dp = new boolean[length][sum/2 + 1];

        for (int i = 0; i < length; i++) {
            dp[i][0] = true;
        }

        dp[0][nums[0]] = true;

        for (int i = 1; i < length; i++) {
            int num = nums[i];
            for (int j = 1; j <= sum /2; j++) {
                if (j >= num) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[length-1][sum/2];

    }
}
