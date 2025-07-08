import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void primeMatrix(int n, int[][] matrix) {
        // Write your logic here.
        int col0 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isPrime(matrix[i][j])) {
                    matrix[i][0] = -1;
                    if (j != 0) {
                        matrix[0][j] = -1;
                    } else {
                        col0 = -1;
                    }
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != -1) {
                    if (matrix[i][0] == -1 || matrix[0][j] == -1) {
                        matrix[i][j] = -1;
                    }
                }
            }
        }
        if (matrix[0][0] == -1) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = -1;
            }
        }
        if (col0 == -1) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        primeMatrix(n, matrix);

        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}