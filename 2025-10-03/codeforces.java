import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int result = (n - 1) * k + 1;
            System.out.println(result);
        }
    }
}
