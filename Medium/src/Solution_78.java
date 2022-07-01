import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 78.子集
 * Subsets
 */
public class Solution_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        dfs(output, subset, 0, nums);
        return output;
    }

    public void dfs(List<List<Integer>> output, List<Integer> subset, int index, int[] nums) {
        if (index == nums.length) {
            output.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        dfs(output, subset, index+1, nums);
        subset.remove(subset.size()-1);
        dfs(output, subset, index+1, nums);
    }
}
