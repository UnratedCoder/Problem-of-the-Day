import java.util.*;

public class unstop {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int total = 0;
        while (n > 1) {
            total += n / 2;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n - 1) / 2 + 1;
            }
        }
        System.out.println(total);
    }
}