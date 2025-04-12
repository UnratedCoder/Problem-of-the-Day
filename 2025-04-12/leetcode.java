public class leetcode {

    // POTD
    public int[][] modifiedMatrix(int[][] matrix) {
        int colMax[] = new int[matrix[0].length];
        for (int col = 0; col < matrix[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < matrix.length; row++) {
                max = Math.max(max, matrix[row][col]);
            }
            colMax[col] = max;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = colMax[j];
                }
            }
        }
        return matrix;
    }

    // Biweekly Contest 154
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int el : nums) {
            sum += el;
        }
        if (sum > k) {
            return sum % k;
        } else if (sum == k) {
            return 0;
        } else {
            return sum;
        }
    }
}
