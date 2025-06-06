import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            long maxProd = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i]++;
                long prod = 1;
                for (int el : arr) {
                    prod *= el;
                }
                maxProd = Math.max(maxProd, prod);
                arr[i]--;
            }
            System.out.println(maxProd);
        }
    }
}