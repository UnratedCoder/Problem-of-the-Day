import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        StringBuilder sb = new StringBuilder();
        int balance = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                sb.append("(");
                sb.append(s, start, i + 1);
                sb.append(")");
                start = i + 1;
            }
        }
        System.out.println(sb);
    }
}