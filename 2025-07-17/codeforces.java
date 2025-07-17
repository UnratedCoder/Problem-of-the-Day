import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static boolean isComposite(int n) {
        if (n <= 3) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int x = 4; x <= n / 2; x++) {
            int y = n - x;
            if (isComposite(x) && isComposite(y)) {
                System.out.println(x + " " + y);
                break;
            }
        }
    }
}