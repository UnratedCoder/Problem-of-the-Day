import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int user_logic(int N, int M, int L, int[][][] warehouse) {
        // Write your logic here.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < L; k++) {
                    max = Math.max(max, warehouse[i][j][k]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();

        int[][][] warehouse = new int[N][M][L];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < L; k++) {
                    warehouse[i][j][k] = sc.nextInt();
                }
            }
        }

        int result = user_logic(N, M, L, warehouse);
        System.out.println(result);
    }
}
