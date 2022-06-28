/**
 * LeetCode 34.在排序数组中查找元素的第一个和最后一个位置
 * Find First and Last Position of Element in Sorted Array
 */
public class Solution_34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length < 1) {
            return new int[]{-1,-1};
        }
        int[] output = new int[2];

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= target) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        if (nums[right] != target) {
            return new int[]{-1, -1};
        }

        output[0] = right;

        left = 0;
        right = nums.length - 1;

        while (left < right) {
            int mid = (left + right + 1) / 2;

            if (nums[mid] <= target) {
                left = mid;
            }
            else {
                right = mid - 1;
            }
        }

        output[1] = right;

        return output;
    }
}
