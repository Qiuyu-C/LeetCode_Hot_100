/**
 * LeetCode 75.颜色分类
 * Sort Colors
 */
public class Solution_75 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int red = 0;
        int blue = n;
        int temp = 0;
        int i = 0;

        while (i < blue) {
            if (nums[i] == 0) {
                temp = nums[i];
                nums[i] = nums[red];
                nums[red] = temp;

                red += 1;
                i += 1;
            }
            else if (nums[i] == 1) {
                i += 1;
            }

            else {
                blue -= 1;
                temp = nums[i];
                nums[i] = nums[blue];
                nums[blue] = temp;
            }
        }
    }
}
