/**
 * LeetCode 79. 单词搜索
 * Word Search
 */
public class Solution_79 {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        boolean[][] checked = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                boolean find = dfs(board, checked, i, j, 0, word);
                if (find) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs (char[][] board, boolean[][] checked, int row, int column, int letterNum, String word) {
        if (letterNum >= word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length || column < 0 || column >= board[0].length) {
            return false;
        }

        if (checked[row][column]) {
            return false;
        }

        if (board[row][column] != word.charAt(letterNum)) {
            return false;
        }

        checked[row][column] = true;

        boolean up = dfs(board, checked, row-1, column, letterNum+1, word);
        boolean down = dfs(board, checked, row+1, column, letterNum+1, word);
        boolean left = dfs(board, checked, row, column-1, letterNum+1, word);
        boolean right = dfs(board, checked, row, column+1, letterNum+1, word);

        if (up || down || left || right) {
            return true;
        }

        checked[row][column] = false;

        return false;
    }
}
