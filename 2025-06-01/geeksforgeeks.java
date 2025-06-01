public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int count = 0;
        int n = mat1.length;
        int si = 0;
        int ei = n * n - 1;
        while (si < n * n && ei >= 0) {
            int r1 = si / n;
            int c1 = si % n;
            int r2 = ei / n;
            int c2 = ei % n;
            int val = mat1[r1][c1] + mat2[r2][c2];
            if (val == x) {
                count++;
                si++;
                ei--;
            } else if (val < x) {
                si++;
            } else {
                ei--;
            }
        }
        return count;
    }
}