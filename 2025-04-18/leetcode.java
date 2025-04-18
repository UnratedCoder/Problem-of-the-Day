public class leetcode {

    // LeetCode Problem
    public boolean satisfiesConditions(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i < grid.length - 1 && grid[i][j] != grid[i + 1][j]) {
                    return false;
                } else if (j < grid[0].length - 1 && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
