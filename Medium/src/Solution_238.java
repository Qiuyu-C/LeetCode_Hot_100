/**
 * LeetCode 238.除自身以外数组的乘积
 * Product of Array Except Self
 */
public class Solution_238 {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] product = new int[length];

        product[0] = 1;
        for (int i = 1; i < length; i++) {
            product[i] = product[i-1] * nums[i-1];
        }

        int temp = 1;
        for (int j = length-2; j >= 0; j--) {
            temp = temp * nums[j];
            product[j] = product[j] * temp;
        }

        return product;
    }
}
