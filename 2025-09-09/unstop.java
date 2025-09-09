import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int alphaBitwiseOperation(int n, int[] arr) {
        // Write your logic here.
        int bit[] = new int[32];
        for (int el : arr) {
            for (int i = 0; i < 32; i++) {
                if ((el & (1 << i)) != 0) {
                    bit[i]++;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bit[i] > n / 2) {
                result |= (1 << i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ensure the length of the array matches N
        if (arr.length != n) {
            throw new IllegalArgumentException("Array length does not match n");
        }

        // Call user logic function and print the output
        int result = alphaBitwiseOperation(n, arr);
        System.out.println(result);
    }
}
