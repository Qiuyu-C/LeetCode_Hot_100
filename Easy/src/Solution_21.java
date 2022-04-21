/**
 * LeetCode 21.合并两个有序链表
 *
 */
public class Solution_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 0 <= node.val <= 50
        ListNode head = new ListNode(-1);
        ListNode mergeList = head;

        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                mergeList.next = list1;
                list1 = list1.next;
                mergeList = mergeList.next;
            }

            else {
                mergeList.next = list2;
                list2 = list2.next;
                mergeList = mergeList.next;
            }
        }

        if (list1 == null) {
            mergeList.next = list2;
        }

        if (list2 == null) {
            mergeList.next = list1;
        }

        return head.next;
    }
}
