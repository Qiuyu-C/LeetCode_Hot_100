/**
 * LeetCode 198.打家劫舍
 * House Robber
 */
public class Solution_198 {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        if (length == 1){
            return nums[0];
        }

        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);

        for (int i = 2; i < length; i++) {
            int temp = second;
            second = Math.max(first+nums[i], second);
            first = temp;
        }

        return second;
    }
}
