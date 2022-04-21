import java.util.HashMap;

/**
 * LeetCode 01. 两数之和
 */
public class Solution_01 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        // add numbers to numsMap
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            if (numsMap.containsKey(target-nums[j]) && numsMap.get(target-nums[j]) != j) {
                result[0] = j;
                result[1] = numsMap.get(target-nums[j]);
            }
        }

        return result;
    }
}
