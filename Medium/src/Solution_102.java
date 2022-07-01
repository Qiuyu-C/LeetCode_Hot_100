import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 102.二叉树的层序遍历
 * Binary Tree Level Order Traversal
 */
public class Solution_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        getValue(output, root, 1);
        return output;
    }

    public void getValue(List<List<Integer>> output, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level > output.size()) {
            List<Integer> value = new ArrayList<>();
            output.add(value);
        }
        List<Integer> targetList = output.get(level-1);
        targetList.add(node.val);

        getValue(output, node.left, level+1);
        getValue(output, node.right, level+1);
    }
}
