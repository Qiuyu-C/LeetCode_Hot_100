import java.util.Arrays;

/**
 * LeetCode 215.数组中的第k个最大元素
 * Kth Largest Element in an Array
 */
public class Solution_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int targetIndex = nums.length - k;
        return nums[targetIndex];
    }
}