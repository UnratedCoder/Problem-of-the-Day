import java.util.*;

public class unstop {

    // Unstop Code Conquest (Problem of the Day)
    public static float calculate_highest_average_efficiency(int N, int[] efficiencies) {
        // Write your logic here.
        Arrays.sort(efficiencies);
        if (N < 5) {
            return 0.00000f;
        }
        int remove = N / 5;
        float sum = 0.00000f;
        for (int i = remove; i < N; i++) {
            sum += efficiencies[i];
        }
        return Float.parseFloat(String.format("%.5f", sum / (N - remove)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] efficiencies = new int[N];
        for (int i = 0; i < N; i++) {
            efficiencies[i] = sc.nextInt();
        }
        float result = calculate_highest_average_efficiency(N, efficiencies);
        System.out.printf("%.5f", result);
    }
}