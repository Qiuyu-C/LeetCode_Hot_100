/**
 * LeetCode 538.把二叉搜索树转换为累加树
 * Convert BST to Greater Tree
 */
public class Solution_538 {
    int value = 0;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.right);
        System.out.println("this is node: " + node.val);
        value += node.val;
        node.val = value;
        dfs(node.left);
        System.out.println("this is node: " + node.val);
    }
}
