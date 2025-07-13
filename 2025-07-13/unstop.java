import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void findRequiredXor(int n, int m, int[] arr) {
        // Write your logic here.
        int xor = 0;
        for (int el : arr) {
            xor ^= el;
        }
        System.out.println(xor ^ m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findRequiredXor(n, m, arr);
    }
}