/**
 * LeetCode 48.旋转图像
 * Rotate Image
 */
public class Solution_48 {
    public void rotate(int[][] matrix) {
        int k = matrix.length;

        for (int i = 0; i < k/2; i++) {
            for (int j = 0; j < (k+1)/2; j++) {
                int temp = matrix[i][j];
                // rotate
                matrix[i][j] = matrix[k-j-1][i];
                matrix[k-j-1][i] = matrix[k-i-1][k-j-1];
                matrix[k-i-1][k-j-1] = matrix[j][k-i-1];
                matrix[j][k-i-1] = temp;
            }
        }

    }
}
