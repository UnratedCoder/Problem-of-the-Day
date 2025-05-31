public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int countSmallerToK(int mat[][], int k) {
        int count = 0;
        int row = 0;
        int col = mat.length - 1;
        while (row < mat.length && col >= 0) {
            if (mat[row][col] <= k) {
                count += (col + 1);
                row++;
            } else {
                col--;
            }
        }
        return count;
    }

    public int kthSmallest(int[][] matrix, int k) {
        // code here
        int kthSmall = 0;
        int si = matrix[0][0];
        int ei = matrix[matrix.length - 1][matrix.length - 1];
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            int count = countSmallerToK(matrix, mid);
            if (count < k) {
                si = mid + 1;
            } else {
                kthSmall = mid;
                ei = mid - 1;
            }
        }
        return kthSmall;
    }
}