public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int numSubmat(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int h[] = new int[m], result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                h[j] = mat[i][j] == 0 ? 0 : h[j] + 1;
            }
            for (int j = 0; j < m; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = j; k >= 0; k--) {
                    min = Math.min(min, h[k]);
                    result += min;
                }
            }
        }
        return result;
    }
}
