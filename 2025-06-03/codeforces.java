import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int n = scan.nextInt();
            int k = n - (n - y) % x;
            System.out.println(k);
        }
    }
}