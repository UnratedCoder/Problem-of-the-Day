import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int count = 0;
            if (n == 1) {
                count = 2;
            } else if (n == 2 || n == 3) {
                count = 1;
            } else {
                count = (n + 2) / 3;
            }
            System.out.println(count);
        }
        scan.close();
    }
}