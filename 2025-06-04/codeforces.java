import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int x = scan.nextInt();
            int digit = x % 10;
            int len = String.valueOf(x).length();
            int totalButtonPressed = (digit - 1) * 10 + len * (len + 1) / 2;
            System.out.println(totalButtonPressed);
        }
    }
}