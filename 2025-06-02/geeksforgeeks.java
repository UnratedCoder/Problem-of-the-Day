import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int uniquePathsUtil(int grid[][], int dp[][], int i, int j) {
        int row = grid.length;
        int col = grid[0].length;
        if (i == row || j == col) {
            return 0;
        }
        if (grid[i][j] == 1) {
            return 0;
        }
        if (i == row - 1 && j == col - 1) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        dp[i][j] = uniquePathsUtil(grid, dp, i + 1, j) + uniquePathsUtil(grid, dp, i, j + 1);
        return dp[i][j];
    }

    public int uniquePaths(int[][] grid) {
        // code here
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return uniquePathsUtil(grid, dp, 0, 0);
    }
}