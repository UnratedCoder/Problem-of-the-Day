import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int perimeter = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                perimeter = Math.min(perimeter, 2 * (i + n / i));
            }
        }
        System.out.println(perimeter);
    }
}