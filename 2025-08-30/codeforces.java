import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int arr[] = new int[2 * n];
            int oddCount = 0, evenCount = 0;
            for (int i = 0; i < 2 * n; i++) {
                arr[i] = scan.nextInt();
                if (arr[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.println(evenCount == oddCount ? "Yes" : "No");
        }
    }
}