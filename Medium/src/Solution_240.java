/**
 * LeetCode 240.搜索二维矩阵II
 * Search a 2D Matrix II
 */
public class Solution_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        int x = 0;
        int y = column - 1;

        while (x < row && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            }
            else if (matrix[x][y] > target) {
                y -= 1;
            }
            else {
                x += 1;
            }
        }

        return false;
    }
}
