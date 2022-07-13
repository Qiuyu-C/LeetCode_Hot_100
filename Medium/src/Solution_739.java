import java.util.Deque;
import java.util.LinkedList;

/**
 * LeetCode 739.每日温度
 * Daily Temperatures
 */
public class Solution_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] answer = new int[length];

        Deque<Integer> temp = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            while (!temp.isEmpty() && temperatures[i] > temperatures[temp.peek()]) {
                answer[temp.peek()] = i- temp.peek();
                temp.pop();
            }

            temp.push(i);
        }

        return answer;
    }
}
