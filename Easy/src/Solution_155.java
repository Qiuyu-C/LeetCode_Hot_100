import java.util.Deque;
import java.util.LinkedList;

/**
 * LeetCode 155.最小栈
 * class MinStack
 * Solution_155 => MinStack
 */


public class Solution_155 {
    private Deque<Integer> stack = new LinkedList<>();
    private Deque<Integer> minStack = new LinkedList<>();
    Solution_155() {

    }

    void push(int val) {
        if (!minStack.isEmpty()) {
            if (val <= minStack.peek()) {
                minStack.push(val);
            }
        }
        else {
            minStack.push(val);
        }
        stack.push(val);
    }

    void pop() {
        if (stack.peek() <= minStack.peek()) {
            minStack.pop();
        }
        stack.pop();
    }

    int top() {
        return stack.peek();
    }

    int getMin() {
        return minStack.peek();
    }
}
