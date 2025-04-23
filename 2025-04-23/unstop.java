import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void userLogic(int n, int[] arr) {
        // Write your logic here
        int pref[] = new int[n];
        pref[0] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] * arr[i - 1];
        }
        int suff[] = new int[n];
        suff[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = pref[i] * suff[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        userLogic(n, arr);
        // Assuming userLogic modifies arr in place
        for (int res : arr) {
            System.out.println(res);
        }
    }
}