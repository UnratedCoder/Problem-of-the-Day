public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static int balanceSums(int[][] mat) {
        // code here
        int n = mat.length;
        int result = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = 0; j < n; j++) {
                currSum += mat[i][j];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        for (int j = 0; j < n; j++) {
            int currSum = 0;
            for (int i = 0; i < n; i++) {
                currSum += mat[i][j];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = 0; j < n; j++) {
                currSum += mat[i][j];
            }
            result += maxSum - currSum;
        }
        return result;
    }
}