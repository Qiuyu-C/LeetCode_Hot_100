import java.util.HashMap;

/**
 * LeetCode 96.不同的二叉搜索树
 * Unique Binary Search Trees
 */
public class Solution_96 {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            int leftNum = numTrees(i-1);
            int rightNum = numTrees(n-i);

            count += leftNum * rightNum;
        }

        map.put(n, count);

        return count;

    }
}
