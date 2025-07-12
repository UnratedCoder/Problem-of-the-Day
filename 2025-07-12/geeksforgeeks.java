public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean isValidMoves(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public int maxGold(int[][] mat) {
        // code here
        int result = 0;
        int n = mat.length, m = mat[0].length;
        for (int j = m - 2; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                int maxPrev = 0;
                if (isValidMoves(i - 1, j + 1, n, m)) {
                    maxPrev = Math.max(maxPrev, mat[i - 1][j + 1]);
                }
                if (isValidMoves(i, j + 1, n, m)) {
                    maxPrev = Math.max(maxPrev, mat[i][j + 1]);
                }
                if (isValidMoves(i + 1, j + 1, n, m)) {
                    maxPrev = Math.max(maxPrev, mat[i + 1][j + 1]);
                }
                mat[i][j] += maxPrev;
            }
        }
        for (int i = 0; i < n; i++) {
            result = Math.max(result, mat[i][0]);
        }
        return result;
    }
}