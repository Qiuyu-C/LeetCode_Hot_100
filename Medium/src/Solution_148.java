/**
 * LeetCode 148.排序链表
 * Sort List
 */
public class Solution_148 {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }

        int length = 0;

        ListNode node = head;
        while (node != null) {
            node = node.next;
            length += 1;
        }

        ListNode dummyHead = new ListNode(0, head);
        for (int subLength = 1; subLength < length; subLength <<= 1) {
            ListNode prev = dummyHead;
            ListNode curr = dummyHead.next;
            while (curr != null) {
                ListNode subHead1 = curr;

                for (int i = 1; i < subLength && curr.next != null; i++) {
                    curr = curr.next;
                }

                ListNode subHead2 = curr.next;
                curr.next = null;
                curr = subHead2;

                for (int i = 1; i < subLength && curr != null && curr.next != null; i++) {
                    curr = curr.next;
                }

                ListNode next = null;
                if(curr != null) {
                    next = curr.next;
                    curr.next = null;
                }

                ListNode mergeList = merge(subHead1, subHead2);
                prev.next = mergeList;
                while (prev.next != null) {
                    prev = prev.next;
                }

                curr = next;
            }
        }

        return dummyHead.next;
    }
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead, temp1 = head1, temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 != null) {
            temp.next = temp1;
        } else if (temp2 != null) {
            temp.next = temp2;
        }
        return dummyHead.next;
    }
}
