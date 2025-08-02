public class leetcode {

    // LeetCode Problem
    public int[] findColumnWidth(int[][] grid) {
        int result[] = new int[grid[0].length];
        for (int j = 0; j < grid[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < grid.length; i++) {
                max = Math.max(max, Integer.toString(grid[i][j]).length());
            }
            result[j] = max;
        }
        return result;
    }
}
