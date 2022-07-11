import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 347.前K个高频元素
 * Top K Frequent Elements
 */

public class Solution_347 {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int length = nums.length;
        if (length < 2) {
            int[] output = new int[k];
            output[0] = nums[0];
            return output;
        }
        List<List<Integer>> frequent = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i] == nums[i-1]) {
                count += 1;
            }
            else {
                List<Integer> numFrequent = new ArrayList<>();
                numFrequent.add(nums[i-1]);
                numFrequent.add(count);
                frequent.add(numFrequent);
                count = 1;
            }

            if (i == length-1) {
                if (nums[length-1] ==  nums[length-2]) {
                    List<Integer> numFrequent = new ArrayList<>();
                    numFrequent.add(nums[length-1]);
                    numFrequent.add(count);
                    frequent.add(numFrequent);
                }
                else {
                    List<Integer> numFrequent = new ArrayList<>();
                    numFrequent.add(nums[length-1]);
                    numFrequent.add(1);
                    frequent.add(numFrequent);
                }
            }
        }

        frequent.sort((l1,l2)->l1.get(1)- l2.get(1));

        int[] output = new int[k];
        int size = frequent.size();
        for (int j = 0; j < k; j++) {
            output[j] = frequent.get(size-1-j).get(0);
        }

        return output;
    }
}
