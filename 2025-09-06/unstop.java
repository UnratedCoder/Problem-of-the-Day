import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int zigzagSum(int[][] matrix) {
        // User will implement the logic here
        int n = matrix.length;
        int m = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    sum += matrix[i][j];
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int result = zigzagSum(matrix);

        System.out.println(result);
    }
}
