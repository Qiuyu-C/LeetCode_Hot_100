import java.util.HashMap;

/**
 * LeetCode 128.最长连续序列
 * Longest Consecutive Sequence
 */
public class Solution_128 {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums[i]);
        }

        int maxConsecutive = 0;

        for (int k = 0; k < nums.length; k++) {
            if (!map.containsKey(nums[k] - 1)) {
                int rightBond = nums[k];

                while (map.containsKey(rightBond + 1)) {
                    map.remove(rightBond);
                    rightBond = map.get(rightBond + 1);
                }

                map.put(nums[k], rightBond);

                maxConsecutive = Math.max(maxConsecutive, rightBond-nums[k]+1);
            }
        }

        return maxConsecutive;
    }
}
