import java.util.Deque;
import java.util.LinkedList;

/**
 * LeetCode 394.字符串解码
 * Decode String
 */

public class Solution_394 {
    public String decodeString(String s) {
        int length = s.length();
        String decode = "";
        Deque<Integer> nums = new LinkedList<>();
        Deque<Character> letters = new LinkedList<>();

        StringBuffer numSb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                numSb.append(s.charAt(i));
            }
            else if (s.charAt(i) == '[') {
                int num = Integer.parseInt(numSb.toString());
                nums.push(num);
                numSb.delete(0,numSb.length());
                letters.push(s.charAt(i));
            }

            else if (s.charAt(i) == ']') {
                int multi = nums.peek();
                nums.pop();
                StringBuffer sb = new StringBuffer();

                while(letters.peek() != '[') {
                    sb.insert(0,letters.peek());
                    letters.pop();
                }
                letters.pop();

                String temp = sb.toString();
                String subString = "";

                for (int j = 0; j < multi; j++) {
                    subString += temp;
                }

                decode += subString;
                System.out.println(sb);
            }
            else {
                letters.push(s.charAt(i));
            }
        }

        return decode;
    }
}

/**
 * StringBuilder res = new StringBuilder();
 *         int multi = 0;
 *         LinkedList<Integer> stack_multi = new LinkedList<>();
 *         LinkedList<String> stack_res = new LinkedList<>();
 *         for(Character c : s.toCharArray()) {
 *             if(c == '[') {
 *                 stack_multi.addLast(multi);
 *                 stack_res.addLast(res.toString());
 *                 multi = 0;
 *                 res = new StringBuilder();
 *             }
 *             else if(c == ']') {
 *                 StringBuilder tmp = new StringBuilder();
 *                 int cur_multi = stack_multi.removeLast();
 *                 for(int i = 0; i < cur_multi; i++) tmp.append(res);
 *                 res = new StringBuilder(stack_res.removeLast() + tmp);
 *             }
 *             else if(c >= '0' && c <= '9') multi = multi * 10 + Integer.parseInt(c + "");
 *             else res.append(c);
 *         }
 *         return res.toString();
 */
