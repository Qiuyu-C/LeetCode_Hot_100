/**
 * LeetCode 152.乘积最大子数组
 * Maximum Product Subarray
 */
public class Solution_152 {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] dpMax = new int[length];
        int[] dpMin = new int[length];

        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int maxMulti = dpMax[0];

        for (int i = 1; i < length; i++) {
            dpMax[i] = Math.max(dpMax[i-1]*nums[i], Math.max(nums[i], dpMin[i-1]*nums[i]));
            dpMin[i] = Math.min(dpMin[i-1]*nums[i], Math.min(nums[i], dpMax[i-1]*nums[i]));

            maxMulti = Math.max(maxMulti, dpMax[i]);
        }

        return maxMulti;
    }
}
