import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int findCentralChildPosition(int[] arr) {
        // Write your logic here.
        int total = 0;
        for (int el : arr) {
            total += el;
        }
        int pref = 0;
        for (int i = 0; i < arr.length; i++) {
            int suff = total - pref - arr[i];
            if (pref == suff) {
                return i + 1;
            }
            pref += arr[i];
        }
        return arr.length == 1 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int result = findCentralChildPosition(arr);
        System.out.println(result);
    }
}