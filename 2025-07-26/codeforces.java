import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int m = scan.nextInt();
            int powerOfTen = 1;
            while (powerOfTen * 10 <= m) {
                powerOfTen *= 10;
            }
            System.out.println(m - powerOfTen);
        }
    }
}