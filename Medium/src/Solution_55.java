/**
 * LeetCode 55.跳跃游戏
 * Jump Game
 */
public class Solution_55 {
    public boolean canJump(int[] nums) {
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i <= maxLength) {
                maxLength = Math.max(maxLength, nums[i] + i);
                if (maxLength >= nums.length-1) {
                    return true;
                }
            }
        }

        return false;
    }
}
