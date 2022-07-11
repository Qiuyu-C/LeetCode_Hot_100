import java.util.HashMap;

/**
 * LeetCode 337.打家劫舍III
 * House Robber III
 */
public class Solution_337 {
    public int rob(TreeNode root) {
        HashMap<TreeNode, Integer> choose = new HashMap<>();
        HashMap<TreeNode, Integer> notChoose = new HashMap<>();

        dfs(root, choose, notChoose);

        int max = Math.max(choose.getOrDefault(root, 0), notChoose.getOrDefault(root, 0));

        return max;
    }

    public void dfs(TreeNode node, HashMap<TreeNode, Integer> choose, HashMap<TreeNode, Integer> notChoose) {
        if (node == null) {
            return;
        }

        dfs(node.left, choose, notChoose);
        dfs(node.right, choose, notChoose);

        choose.put(node, node.val + notChoose.getOrDefault(node.left, 0) + notChoose.getOrDefault(node.right, 0));
        notChoose.put(node, Math.max(choose.getOrDefault(node.left, 0), notChoose.getOrDefault(node.left, 0)) +
                Math.max(choose.getOrDefault(node.right, 0), notChoose.getOrDefault(node.right, 0)));
    }
}
