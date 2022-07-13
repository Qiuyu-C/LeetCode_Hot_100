/**
 * LeetCode 560.和为 K 的子数组
 * Subarray Sum Equals K
 */
public class Solution_560 {
    public int subarraySum(int[] nums, int k) {
        int length = nums.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count += 1;
                    // System.out.println(count + "index i: "+ i + ", index j: " + j);
                }
            }
        }

        return count;
    }
}
