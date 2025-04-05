public class geeksforgeeks {

    public void dfs(char ch[][], int r, int c) {
        int row = ch.length;
        int col = ch[0].length;
        if (r < 0 || c < 0 || r >= row || c >= col || ch[r][c] != 'L') {
            return;
        }
        int rNbr[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int cNbr[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
        ch[r][c] = 'W';
        for (int i = 0; i < 8; i++) {
            int newR = r + rNbr[i];
            int newC = c + cNbr[i];
            dfs(ch, newR, newC);
        }
    }

    public int countIslands(char[][] grid) {
        // Code here
        int count = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 'L') {
                    dfs(grid, i, j);
                    ++count;
                }
            }
        }
        return count;
    }
}