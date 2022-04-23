import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 94. 二叉树的中序遍历
 */
public class Solution_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        findNode(root, list);
        return list;
    }

    public void findNode (TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        findNode(node.left, list);
        list.add(node.val);
        findNode(node.right, list);
    }
}
