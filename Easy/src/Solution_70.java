/**
 * LeetCode 70.爬楼梯
 */
public class Solution_70 {
    public int climbStairs(int n) {
        // step(n) = step(n-1) + step(n-2)
        // => Fibonacci
        if (n == 1) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int step = 0;

        for (int i = 2; i <= n; i++) {
            step = a + b;
            a = b;
            b = step;
        }

        return step;
    }
}
