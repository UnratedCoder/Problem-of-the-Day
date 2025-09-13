import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static String canAddPoint(int[] arr) {
        int n = arr.length;
        if (n > 2) {
            return "NO";
        }
        if (n == 2) {
            if (arr[1] - arr[0] > 1) {
                return "YES";
            } else {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println(canAddPoint(arr));
        }
    }
}