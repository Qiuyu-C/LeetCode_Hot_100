/**
 * LeetCode 543.二叉树的直径
 */

public class Solution_543 {
    int maxPath;
    public int diameterOfBinaryTree(TreeNode root) {
        maxPath = 1;
        dfs(root);

        return maxPath - 1;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);
        maxPath = Math.max(maxPath, left+right+1);
        return Math.max(left, right) + 1;
    }
}
