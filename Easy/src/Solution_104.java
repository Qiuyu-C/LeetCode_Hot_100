/**
 * LeetCode 104.二叉树的最大深度
 */
public class Solution_104 {
    public int maxDepth(TreeNode root) {
        int maxDepth = dfs(root, 0);
        return maxDepth;
    }

    public int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        else {
            depth += 1;
        }

        return Math.max(dfs(node.left, depth), dfs(node.right, depth));
    }
}
