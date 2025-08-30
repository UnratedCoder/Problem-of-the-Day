public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (mat[j][i] == 1) {
                j--;
            } else {
                i++;
            }
        }
        int c = i;
        for (i = 0; i < n; i++) {
            if (i == c) {
                continue;
            }
            if (mat[c][i] != 0 || mat[i][c] == 0) {
                return -1;
            }
        }
        return c;
    }
}