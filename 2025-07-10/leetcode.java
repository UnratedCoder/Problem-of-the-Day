public class leetcode {

    // LeetCode Problem
    public int findChampion(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int team = 0;
        for (int i = 0; i < grid.length; i++) {
            int count1 = 0;
            for (int j = 0; j < grid[i].length; j++) {
                count1 += grid[i][j] == 1 ? 1 : 0;
            }
            if (max < count1) {
                max = count1;
                team = i;
            }
        }
        return team;
    }
}
