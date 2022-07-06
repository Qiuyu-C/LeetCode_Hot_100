import java.util.Deque;
import java.util.LinkedList;

/**
 * LeetCode 155.最小栈
 * Min Stack
 */
public class MinStack {
    private Deque<Integer> minStack;
    private Deque<Integer> helperStack;

    public MinStack() {
        minStack = new LinkedList<>();
        helperStack = new LinkedList<>();
        helperStack.push(Integer.MAX_VALUE);

    }

    public void push(int val) {
        minStack.push(val);
        helperStack.push(Math.min(helperStack.peek(), val));
    }

    public void pop() {
        minStack.pop();
        helperStack.pop();
    }

    public int top() {
        return minStack.peek();
    }

    public int getMin() {
        return helperStack.peek();
    }
}
