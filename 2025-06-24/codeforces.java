import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int highestBit = 31 - Integer.numberOfLeadingZeros(n);
            int ans = (1 << highestBit) - 1;
            System.out.println(ans);
        }
        scan.close();
    }
}