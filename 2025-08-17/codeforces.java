import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static boolean isPerfectSquare(int num) {
        int root = (int) Math.round(Math.sqrt(num));
        return root * root == num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == 0 && y == 0) {
                System.out.println(0);
            } else if (isPerfectSquare(x * x + y * y)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}