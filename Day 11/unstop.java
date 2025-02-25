import java.util.Scanner;

public class unstop {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i + 1);
            if (ch1 == ch2) {
                sb.delete(i, i + 2);
                if (i == 0) {
                    i--;
                } else {
                    i -= 2;
                }
            }
        }
        System.out.println(sb);
    }
}
