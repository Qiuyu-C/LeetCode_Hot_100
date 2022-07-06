/**
 * LeetCode 200.岛屿数量
 * Number of Islands
 */
public class Solution_200 {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1'){
                    dfs(grid, i, j, row, column);
                    count += 1;
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int i, int j, int row, int column) {
        if (i < 0 || i >= row || j < 0 || j >= column) {
            return;
        }

        if (grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i-1, j, row, column);
        dfs(grid, i+1, j, row, column);
        dfs(grid, i, j-1, row, column);
        dfs(grid, i, j+1, row, column);
    }
}
