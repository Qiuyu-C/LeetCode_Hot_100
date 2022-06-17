/**
 * LeetCode 11.盛最多水的容器
 */
public class Solution_11 {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int l = right - left;
            area = Math.max(area, h * l);

            if (height[left] <= height[right]) {
                left += 1;
            }
            else {
                right -= 1;
            }
        }

        return area;
    }
}
