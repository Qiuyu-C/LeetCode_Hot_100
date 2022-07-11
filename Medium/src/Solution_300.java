/**
 * LeetCode 300.最长递增子序列
 * Longest Increasing Subsequence
 */
public class Solution_300 {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int dp[] = new int[length];

        int LIS = 1;

        dp[0] = 1;

        for (int i = 1; i < length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }

                LIS = Math.max(dp[i], LIS);
            }
        }

        return LIS;
    }
}
