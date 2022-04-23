import com.sun.source.tree.Tree;

/**
 * LeetCode 101.对称二叉树
 */
public class Solution_101 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check (TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
    }
}
