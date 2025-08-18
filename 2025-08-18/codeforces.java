import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (test-- > 0) {
            long n = scan.nextLong();
            long result = (n + 1) * (n + 1) + 1;
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}