import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 114.二叉树展开为链表
 * Flatten Binary Tree to Linked List
 */
public class Solution_114 {
    public void flatten(TreeNode root) {
        List<TreeNode> nodeList = new ArrayList<>();
        preorderList(root, nodeList);

        if (nodeList.size() == 0) {
            return;
        }

        TreeNode newRoot = nodeList.get(0);

        for (int i = 1; i < nodeList.size(); i++) {
            newRoot.left = null;
            newRoot.right = nodeList.get(i);
            newRoot = newRoot.right;
        }
    }
    public void preorderList(TreeNode node, List<TreeNode> nodeList) {
        if(node == null) {
            return;
        }

        nodeList.add(node);
        preorderList(node.left, nodeList);
        preorderList(node.right, nodeList);
    }
}
