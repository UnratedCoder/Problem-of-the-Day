import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static List<Integer> userLogic(int[][] matrix, List<int[]> queries) {
        // Write your logic here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int r1 = queries.get(i)[0];
            int c1 = queries.get(i)[1];
            int r2 = queries.get(i)[2];
            int c2 = queries.get(i)[3];
            int sum = 0;
            for (int row = r1; row <= r2; row++) {
                for (int col = c1; col <= c2; col++) {
                    sum += matrix[row][col];
                }
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int Q = scanner.nextInt();
        List<int[]> queries = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int row1 = scanner.nextInt();
            int col1 = scanner.nextInt();
            int row2 = scanner.nextInt();
            int col2 = scanner.nextInt();
            queries.add(new int[] { row1, col1, row2, col2 });
        }
        List<Integer> results = userLogic(matrix, queries);
        for (int result : results) {
            System.out.println(result);
        }
    }
}