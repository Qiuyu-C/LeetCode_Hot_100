/**
 * LeetCode 647.回文子串
 * Palindromic Substrings
 */
public class Solution_647 {
    public int countSubstrings(String s) {
        int length = s.length();
        int count = 0;

        int[][] dp = new int[length][length];


        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i-j < 2 || dp[j+1][i-1] == 1)) {
                    dp[j][i] = 1;
                    count += 1;
                }
            }
        }

        return count;
    }
}
