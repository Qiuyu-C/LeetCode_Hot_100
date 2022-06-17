import java.util.HashMap;

/**
 * LeetCode 03.无重复字符的最长子串
 */

public class Solution_03 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int maxLength = 0;
        int head = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            char target = s.charAt(i);
            if (map.containsKey(target)) {
                head = Math.max(head, map.get(target) + 1);
            }
            map.put(target, i);

            maxLength = Math.max(maxLength, i - head + 1);
        }

        return maxLength;
    }
}
