import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * LeetCode 46.全排列
 * Permutations
 */
public class Solution_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();

        for (int num : nums) {
            combine.add(num);
        }

        backtrack(output, combine, nums.length, 0);
        return output;
    }

    public void backtrack(List<List<Integer>> output, List<Integer> combine, int n, int k) {
        if (k == n) {
            output.add(new ArrayList<>(combine));
        }

        for (int i = k; i < n; i++) {
            Collections.swap(combine, k, i);
            backtrack(output, combine, n, k+1);
            Collections.swap(combine, k, i);
        }
    }
}
