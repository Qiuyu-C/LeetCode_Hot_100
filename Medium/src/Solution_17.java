import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * LeetCode 17.电话号码的的字母组合
 */
public class Solution_17 {
        HashMap<Character, String> numMap = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> letters = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        if (digits.length() == 0) {
            return letters;
        }
        numMap.put('2', "abc");
        numMap.put('3', "def");
        numMap.put('4', "ghi");
        numMap.put('5', "jkl");
        numMap.put('6', "mno");
        numMap.put('7', "pqrs");
        numMap.put('8', "tuv");
        numMap.put('9', "wxyz");

        track(letters, digits, sb, 0);
        return letters;
    }

    public void track(List<String> combination, String digits, StringBuffer letter, int index) {
        if (index == digits.length()) {
            combination.add(letter.toString());
        }
        else {
            char key = digits.charAt(index);
            String target = numMap.get(key);

            for (int i = 0; i < target.length(); i++) {
                letter.append(target.charAt(i));
                track(combination, digits, letter, index+1);
                letter.deleteCharAt(index);
            }
        }
    }
}