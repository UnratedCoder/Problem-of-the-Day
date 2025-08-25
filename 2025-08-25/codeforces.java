import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int m = scan.nextInt();
            int s = scan.nextInt();
            int[] b = new int[m];
            int sum = 0;
            int max = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < m; i++) {
                b[i] = scan.nextInt();
                sum += b[i];
                max = Math.max(max, b[i]);
                set.add(b[i]);
            }
            int total = sum + s;
            boolean possible = false;
            int n = max;
            while (n * (n + 1) / 2 < total) {
                n++;
            }
            if (n * (n + 1) / 2 == total) {
                possible = true;
            }
            System.out.println(possible ? "YES" : "NO");
        }
        scan.close();
    }
}