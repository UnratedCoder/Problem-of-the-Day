import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int getCount(int n) {
        // code here
        int result = 0;
        int prev[][] = new int[4][3];
        for (int i = 0; i < 4; i++) {
            Arrays.fill(prev[i], 1);
        }
        prev[3][0] = 0;
        prev[3][2] = 0;
        int curr[][] = new int[4][3];
        int dir[][] = { { 0, 0 }, { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    curr[j][k] = 0;
                    if (j == 3 && (k == 0 || k == 2)) {
                        continue;
                    }
                    for (int[] d : dir) {
                        int x = j + d[0], y = k + d[1];
                        if (x >= 0 && x < 4 && y >= 0 && y < 3) {
                            curr[j][k] += prev[x][y];
                        }
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    prev[j][k] = curr[j][k];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                result += prev[i][j];
            }
        }
        return result;
    }
}