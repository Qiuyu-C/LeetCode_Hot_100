/**
 * LeetCode 287.寻找重复数
 *  Find the Duplicate Number
 *  逻辑根据——>Solution_142 环形链表处理
 */
public class Solution_287 {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        do {
            int stepTwo = nums[fast];
            fast = nums[stepTwo];
            slow = nums[slow];
        } while (slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}
