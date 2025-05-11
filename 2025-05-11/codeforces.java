import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int count = 0;
            if (b > a) {
                count++;
            }
            if (c > a) {
                count++;
            }
            if (d > a) {
                count++;
            }
            System.out.println(count);
        }
        scan.close();
    }
}