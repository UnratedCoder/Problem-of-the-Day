import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                int el = scan.nextInt();
                if (el % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (odd > 0 && even > 0) {
                System.out.println("YES");
            } else if (odd % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}