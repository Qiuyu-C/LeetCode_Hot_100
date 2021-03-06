import com.sun.source.tree.Tree;

/**
 * LeetCode 236.二叉树的最近公共祖先
 */
public class Solution_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right,p, q);

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left == null && right == null) {
            return null;
        }

        return root;
    }
}
