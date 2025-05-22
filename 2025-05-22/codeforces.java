import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            int operation = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    operation++;
                    i += k - 1;
                }
            }
            System.out.println(operation);
        }
        scan.close();
    }
}