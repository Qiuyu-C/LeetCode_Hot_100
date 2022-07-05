/**
 * LeetCode 142.环形链表II
 * Linked List Cycle II
 */

public class Solution_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = new ListNode();
        ListNode slow = new ListNode();

        fast = head;
        slow = head;

        // 设环外部分距离为a，环内走了b距离相遇，环内剩下距离为c
        // fast和slow相遇时fast走的距离->a+n*(b+c)+b
        // slow在相遇时走的距离->a+b
        // fast速度为slow两倍
        // a+n*(b+c)+b = 2*(a+b)
        // (n-1)*b + n*c - a = 0
        // (n-1)*b + n*c = a
        // (n-1)*(b+c) + c = a
        // b+c 为环
        // -> c = a
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            }
            else {
                return null;
            }

            if (fast == slow) {
                ListNode position = head;

                while (position != slow) {
                    position = position.next;
                    slow = slow.next;
                }
                return position;
            }
        }

        return null;
    }
}
