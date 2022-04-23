/**
 * LeetCode 169.多数元素
 */
public class Solution_169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[0];
            }

            count += nums[i] ==  candidate ? 1:-1;
        }

        return candidate;
    }
}
