import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 22.括号生成
 */
public class Solution_22 {
    List<String> output = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n < 1) {
            return null;
        }

        String letter = "";
        dfs(letter, 0, 0, n);

        return output;
    }

    public void dfs(String letter, int left, int right, int n) {
        if (left > n || right > left) {
            return;
        }
        if (letter.length() == 2*n) {
            output.add(letter);
            return;
        }

        dfs(letter+"(", left+1, right, n);
        dfs(letter+")", left, right+1, n);
    }
}
