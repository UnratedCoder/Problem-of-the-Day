import java.util.*;

public class unstop {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += Integer.bitCount(i);
        }
        System.out.println(count);
    }
}