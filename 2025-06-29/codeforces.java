import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
                min = Math.min(min, arr[i]);
            }
            int count = 0;
            for (int el : arr) {
                count += el > min ? 1 : 0;
            }
            System.out.println(count);
        }
        scan.close();
    }
}