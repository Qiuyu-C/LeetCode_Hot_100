/**
 * LeetCode 617.合并二叉树
 */
public class Solution_617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return null;
        }

        if (root1 == null && root2 != null) {
            return root2;
        }

        if (root1 != null && root2 == null) {
            return root1;
        }

        TreeNode newNode = new TreeNode(root1.val + root2.val);
        newNode.left = mergeTrees(root1.left, root2.left);
        newNode.right = mergeTrees(root1.right, root2.right);

        return newNode;
    }

}
