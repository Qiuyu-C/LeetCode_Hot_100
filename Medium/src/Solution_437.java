/**
 * LeetCode 437. 路径总和 III
 * Path Sum III
 */
public class Solution_437 {
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        dfsNode(root, targetSum);
        return count;
    }


    private void dfsNode(TreeNode node, int targetSum) {
        if (node == null) {
            return;
        }
        dfsSum(node, targetSum, 0);
        dfsNode(node.left, targetSum);
        dfsNode(node.right, targetSum);
    }

    public void dfsSum(TreeNode node, int targetSum, int currentSum) {
        if (node == null) {
            return;
        }

        currentSum += node.val;
        if (currentSum == targetSum) {
            count += 1;
        }

        dfsSum(node.left, targetSum, currentSum);
        dfsSum(node.right, targetSum, currentSum);
    }
}
