/**
 * LeetCode 283.移动零
 */
public class Solution_283 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int head = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (count == 0) {
                    head = i;
                }
                count += 1;
            }
            else {
                if (count == 1) {
                    nums[head] = nums[i];
                    nums[i] = 0;
                    head = i;
                }
                else if(count > 1) {
                    nums[head] = nums[i];
                    nums[i] = 0;
                    head = head + 1;
                }
            }
        }
    }
}
