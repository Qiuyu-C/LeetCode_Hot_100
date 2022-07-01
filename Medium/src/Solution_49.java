import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * LeetCode 49.字母异位词分组
 * Group Anagrams
 */
public class Solution_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars); // to get key
            String sortStr = new String(chars);
            List<String> anagram = map.getOrDefault(sortStr, new ArrayList<String>());
            anagram.add(str);
            map.put(sortStr, anagram);
        }

        for (List<String> list : map.values()) {
            output.add(list);
        }
        return output;
    }
}
