/**
 * LeetCode 64.最小路径和
 * Minimum Path Sum
 */
public class Solution_64 {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        int[][] pathSum = new int[row][column];
        pathSum[0][0] = grid[0][0];

        for (int i = 1; i < row; i++) {
            pathSum[i][0] = grid[i][0] + pathSum[i-1][0];
        }

        for (int j = 1; j < column; j++) {
            pathSum[0][j] = grid[0][j] + pathSum[0][j-1];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                int minPrev = Math.min(pathSum[i-1][j], pathSum[i][j-1]);
                pathSum[i][j] = grid[i][j] + minPrev;
            }
        }

        return pathSum[row-1][column-1];
    }
}
