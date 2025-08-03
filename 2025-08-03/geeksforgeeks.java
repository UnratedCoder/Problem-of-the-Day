import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int diff[][] = new int[n][m];
        for (int op[] : opr) {
            int val = op[0];
            int r1 = op[1], c1 = op[2], r2 = op[3], c2 = op[4];
            diff[r1][c1] += val;
            if (c2 + 1 < m)
                diff[r1][c2 + 1] -= val;
            if (r2 + 1 < n)
                diff[r2 + 1][c1] -= val;
            if (r2 + 1 < n && c2 + 1 < m)
                diff[r2 + 1][c2 + 1] += val;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                diff[i][j] += diff[i][j - 1];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                diff[j][i] += diff[j - 1][i];
            }
        }
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(mat[i][j] + diff[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}