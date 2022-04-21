import java.util.Deque;
import java.util.LinkedList;

/**
 * LeetCode 20。有效的括号
 * Pass: 98.84%, 62.31%
 */
public class Solution_20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            // push '(', '[', '{' into stack
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            }

            // if stack is Empty and the loop is not done yet, input string is invalid
            if (stack.isEmpty()) {
                return false;
            }

            if (chars[i] == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }

            if (chars[i] == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }

            if (chars[i] == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
