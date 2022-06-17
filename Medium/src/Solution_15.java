import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 15.三数之和
 */

public class Solution_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int length = nums.length;

        if (length < 3) {
            return output;
        }

        Arrays.sort(nums);
        for (int i = 0; i < length-2; i++) {
            if (nums[i] > 0) {
                break;
            }

            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int target = 0 - nums[i];
            int left = i + 1;
            int right = length - 1;

            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    output.add(list);
                    left += 1;
                    right -= 1;

                    while (left < right && nums[left] == nums[left-1]) {
                        left += 1;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right -= 1;
                    }
                }
                else if (nums[left] + nums[right] < target) {
                    left += 1;
                }
                else {
                    right -= 1;
                }
            }
        }
        return output;
    }
}
