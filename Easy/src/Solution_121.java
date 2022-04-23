import java.util.Deque;
import java.util.LinkedList;

/**
 * LeetCode 121.买卖股票的最佳时机
 */
public class Solution_121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < prices.length; i++) {
            if (stack.isEmpty()) {
                stack.push(prices[i]);
            }
            else {
                if (stack.peek() >= prices[i]) {
                    stack.push(prices[i]);
                }
                else {
                    maxProfit = Math.max(maxProfit, prices[i] - stack.peek());
                }
            }
        }

        return maxProfit;
    }
}
