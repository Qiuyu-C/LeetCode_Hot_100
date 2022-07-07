import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        /*
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(6);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l1.next = l3;
        l3.next = l5;
        l2.next = l4;
        l4.next = l6;

        Solution_02 sol = new Solution_02();
        ListNode out = sol.addTwoNumbers(l1, l2);

        while (out.next != null) {
            System.out.print(out.val);
            out = out.next;
        }*/
        /*
        String s = "leetcode";
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");

        Solution_139 solu = new Solution_139();

        System.out.println(solu.wordBreak(s, list));
         */

        // System.out.println((int)Math.sqrt(143));

        int[] nums = new int[]{4,3,1,4,2};
        Solution_287 solu = new Solution_287();
        int n = solu.findDuplicate(nums);
        System.out.println(n);
    }
}