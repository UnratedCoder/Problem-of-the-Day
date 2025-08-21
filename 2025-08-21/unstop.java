import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                result += arr[i] - arr[i - 1];
            }
        }
        System.out.println(result);
    }
}
