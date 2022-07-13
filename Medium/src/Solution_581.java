/**
 * LeetCode 581.最短无序连续子数组
 * Shortest Unsorted Continuous Subarray
 */
public class Solution_581 {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int right = -1;
        int left = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            if (nums[i] < max) {
                right = i;
            }
            else {
                max = nums[i];
            }

            if (nums[length-i-1] >  min) {
                left = length-i-1;
            }
            else {
                min = nums[length-i-1];
            }
        }

        return right == -1 ? 0 : right - left + 1;
    }
}
