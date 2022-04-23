/**
 * LeetCode 136.只出现一次的数字
 */
public class Solution_136 {
    public int singleNumber(int[] nums) {
        int unique_num = 0;
        for (int i = 0; i < nums.length; i++) {
            unique_num = unique_num ^ nums[i];
        }

        return unique_num;
    }
}
