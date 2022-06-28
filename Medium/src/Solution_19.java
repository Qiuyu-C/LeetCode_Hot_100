/**
 * LeetCode 19.删除链表的倒数第N个节点
 */
public class Solution_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode checkNode = node;
        int count = 0;

        while (head != null) {
            count += 1;
            head = head.next;
        }

        for (int i = 0; i < count-n; i++) {
            checkNode = checkNode.next;
        }

        checkNode.next = checkNode.next.next;

        ListNode output = node;

        return output.next;
    }
}
