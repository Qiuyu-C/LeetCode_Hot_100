/**
 * LeetCode 31.下一个排序
 */
public class Solution_31 {
    public void nextPermutation(int[] nums) {
        int r = nums.length - 2;
        while (r >= 0 && nums[r] >= nums[r+1]) {
            r -= 1;
        }

        if (r >= 0) {
            int k = nums.length - 1;
            while (k >= 0 && nums[r] >= nums[k]) {
                k -= 1;
            }
            swap(r, k, nums);
        }
        reverse(r+1, nums);
    }

    public void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void reverse(int head, int[] array) {
        int left = head;
        int right = array.length-1;
        while (left < right) {
            swap(left, right, array);
            left += 1;
            right -= 1;
        }
    }
}
