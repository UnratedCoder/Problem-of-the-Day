public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        if (m < 3 || n < 3) {
            return 0;
        }
        int[][] waterLevel = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    waterLevel[i][j] = heightMap[i][j];
                } else {
                    waterLevel[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        boolean changed = true;
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (changed) {
            changed = false;
            for (int i = 1; i < m - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    int minNeighbor = Integer.MAX_VALUE;
                    for (int[] d : dirs) {
                        int ni = i + d[0];
                        int nj = j + d[1];
                        minNeighbor = Math.min(minNeighbor, waterLevel[ni][nj]);
                    }
                    int newLevel = Math.max(heightMap[i][j], minNeighbor);
                    if (newLevel < waterLevel[i][j]) {
                        waterLevel[i][j] = newLevel;
                        changed = true;
                    }
                }
            }
        }
        int water = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                water += waterLevel[i][j] - heightMap[i][j];
            }
        }
        return water;
    }
}