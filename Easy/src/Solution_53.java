/**
 * LeetCode 53.最大子数组和
 */
public class Solution_53 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(sum, max);
        }

        return max;
    }
}
