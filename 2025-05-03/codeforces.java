import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int count = 0;
            for (int i = 1; i <= 9; i++) {
                int val = i;
                while (val <= n) {
                    count++;
                    val *= 10;
                }
            }
            System.out.println(count);
        }
    }
}