import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();
        long ans;
        if (n % 2 == 0) {
            ans = n / 2;
        } else {
            ans = -(n / 2 + 1);
        }
        System.out.println(ans);
    }
}