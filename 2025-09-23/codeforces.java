import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int k = scan.nextInt();
            int option1 = Integer.MAX_VALUE;
            int absDiff = Math.abs(x - y);
            if (absDiff <= k) {
                option1 = Math.abs(x) + absDiff;
            }
            int option2 = Math.abs(y) + absDiff;
            int dir = (y > x) ? 1 : -1;
            int dropPos = x + dir * k;
            int toChest = Math.abs(x);
            int carry = k;
            int toKey = Math.abs(dropPos - y);
            int backToChest = toKey;
            int option3 = toChest + carry + toKey + backToChest;
            int result = Math.min(option2, Math.min(option1, option3));
            System.out.println(result);
        }
    }
}