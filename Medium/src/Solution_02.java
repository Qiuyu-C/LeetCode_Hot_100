/**
 * LeetCode 02.两数相加
 */
public class Solution_02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = null;
        ListNode output = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            int sum = num1 + num2 + carry;
            carry = sum > 9 ? 1 : 0;

            if (output == null) {
                newNode = new ListNode(sum % 10);
                output = newNode;
            }
            else {
                newNode.next = new ListNode(sum % 10);
                newNode = newNode.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            newNode.next = new ListNode(carry);
        }

        return output;
    }
}
