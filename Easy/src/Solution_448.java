import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 448.找到所有数组中消失的数字
 */
public class Solution_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        int n = nums.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            index = Math.abs(nums[i]) - 1;
            nums[index] = Math.abs(nums[index]) * -1;
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] > 0) {
                output.add(j+1);
            }
        }
        return output;
    }
}
