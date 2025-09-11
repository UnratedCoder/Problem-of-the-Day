import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static boolean canWaterAllPlants(int[] W, int K, int R) {
        // Write your logic here.
        int jetUsed = 0, currWater = 0;
        for (int i = 0; i < W.length; i++) {
            if (W[i] > R) {
                return false;
            }
            if (currWater + W[i] > R) {
                jetUsed++;
                currWater = W[i];
            } else {
                currWater += W[i];
            }
        }
        if (currWater > 0) {
            jetUsed++;
        }
        return jetUsed <= K;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = scanner.nextInt();
        }

        int R = scanner.nextInt();

        // Call the user logic function
        boolean result = canWaterAllPlants(W, K, R);

        // Print the output as per the problem's output format
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
