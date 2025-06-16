import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            boolean evenParity = a[0] % 2 == 0;
            boolean evenValid = true;
            for (int i = 0; i < n; i += 2) {
                if ((a[i] % 2 == 0) != evenParity) {
                    evenValid = false;
                    break;
                }

            }
            boolean oddParity = a[1 % n] % 2 == 0;
            boolean oddValid = true;
            for (int i = 1; i < n; i += 2) {
                if ((a[i] % 2 == 0) != oddParity) {
                    oddValid = false;
                    break;
                }

            }
            if (evenValid && oddValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}