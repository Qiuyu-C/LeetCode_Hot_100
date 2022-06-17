/**
 * LeetCode 05.最长回文子串
 */

public class Solution_05 {
    public String longestPalindrome(String s) {
        int length = s.length();
        int maxLength = 1;
        int start = 0;

        boolean[][] dp = new boolean[length][length];

        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }

        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(j) == s.charAt(i)) {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                else {
                    dp[i][j] = false;
                }

                if (dp[i][j] && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    start = i;
                }
            }
        }

        String longestPalindrome = s.substring(start, start + maxLength);
        return longestPalindrome;
    }
}
