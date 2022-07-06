/**
 * LeetCode 221.最大正方形
 * Maximal Square
 */
public class Solution_221 {
    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        int row = matrix.length;
        int column = matrix[0].length;

        int[][] dp = new int[row][column];

        for (int i = 0; i < row; i++) {
            dp[i][0] = matrix[i][0] - '0';
            if (matrix[i][0] == '1') {
                maxSide = 1;
            }
        }

        for (int j = 1; j < column; j++) {
            dp[0][j] = matrix[0][j] - '0';
            if (matrix[0][j] == '1') {
                maxSide = 1;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                }
                maxSide = Math.max(maxSide, dp[i][j]);
            }
        }

        int maxSquare = maxSide * maxSide;

        return maxSquare;
    }
}
