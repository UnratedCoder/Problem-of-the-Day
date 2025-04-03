import java.util.*;

public class geeksforgeeks {

    public boolean isSafe(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    public int orangesRotting(int[][] mat) {
        // Code here
        int n = mat.length;
        int m = mat[0].length;
        int dir[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
            }
        }
        int time = 0;
        while (!q.isEmpty()) {
            time++;
            int len = q.size();
            while (len-- > 0) {
                int curr[] = q.poll();
                int i = curr[0];
                int j = curr[1];
                for (int d[] : dir) {
                    int x = i + d[0];
                    int y = j + d[1];
                    if (isSafe(x, y, n, m) && mat[x][y] == 1) {
                        mat[x][y] = 2;
                        q.add(new int[] { x, y });
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    return -1;
                }
            }
        }
        return Math.max(0, time - 1);
    }
}