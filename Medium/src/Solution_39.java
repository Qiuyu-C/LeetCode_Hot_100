import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 39.组合总和
 * Combination Sum
 */
public class Solution_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();

        dfs(output, combine, candidates, target, 0);

        return output;
    }

    public void dfs (List<List<Integer>> output, List<Integer> combine, int[] candidates, int target, int index) {
        if (index == candidates.length) {
            return;
        }

        if (target == 0) {
            output.add(new ArrayList<>(combine));
            return;
        }

        dfs(output, combine, candidates, target, index+1);

        if (target - candidates[index] >= 0) {
            combine.add(candidates[index]);
            dfs(output, combine, candidates, target- candidates[index], index);
            combine.remove(combine.size() - 1);
        }
    }
}
