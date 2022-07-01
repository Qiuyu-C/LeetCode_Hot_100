/**
 * LeetCode 98. 验证二叉搜索树
 * Validate Binary Search Tree
 */
public class Solution_98 {
    public boolean isValidBST(TreeNode root) {
        boolean isValid = checkValid(root, Long.MAX_VALUE, Long.MIN_VALUE);

        return isValid;
    }

    public boolean checkValid (TreeNode node, long upper, long lower) {
        if (node == null) {
            return true;
        }

        if(node.val >= upper ||  node.val <= lower) {
            return false;
        }

        return checkValid(node.left, node.val, lower) && checkValid(node.right, upper, node.val);
    }
}
