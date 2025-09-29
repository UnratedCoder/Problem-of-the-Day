import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (test-- > 0) {
            long n = scan.nextLong();
            long cnt2 = n / 2;
            long cnt3 = n / 3;
            long result = n + 2 * cnt2 + 2 * cnt3;
            sb.append(result).append('\n');
        }
        System.out.print(sb);
    }
}
