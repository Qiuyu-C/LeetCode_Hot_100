import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 438.找到字符串中所有字母异位词
 * Find All Anagrams in a String
 */
public class Solution_438 {
    public List<Integer> findAnagrams(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();

        List<Integer> output = new ArrayList<>();

        char[] pChar = p.toCharArray();

        Arrays.sort(pChar);
        String sortTarget = new String(pChar);

        for (int i = 0; i < sLength-pLength+1; i++) {
            String subString = s.substring(i, i + pLength);

            char[] temp = subString.toCharArray();
            Arrays.sort(temp);
            String sortTemp = new String(temp);
            if (sortTarget.equals(sortTemp)) {
                output.add(i);
            }
        }

        return output;
    }
}
