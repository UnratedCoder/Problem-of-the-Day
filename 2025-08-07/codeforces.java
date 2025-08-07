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
            HashSet<Integer> set = new HashSet<>();
            int i = n - 1;
            while (i >= 0 && !set.contains(arr[i])) {
                set.add(arr[i]);
                i--;
            }
            System.out.println(i + 1);
        }
    }
}