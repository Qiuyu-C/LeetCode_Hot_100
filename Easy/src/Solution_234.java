/**
 * LeetCode 234.回文链表
 */

public class Solution_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        // find the mid-point of given list
        ListNode midPoint = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null && fastNode.next.next != null) {
            fastNode = fastNode.next.next;
            midPoint = midPoint.next;
        }

        ListNode reverse = reverseList(midPoint.next);

        while (reverse != null) {
            if (head.val == reverse.val) {
                head = head.next;
                reverse = reverse.next;
            }
            else {
                return false;
            }
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
