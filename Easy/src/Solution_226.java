public class Solution_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left;
        TreeNode right;

        left = invertTree(root.left);
        right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }
}
