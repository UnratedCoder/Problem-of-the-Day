import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean canPrinted(String s) {
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == 'W') {
                i++;
                continue;
            }
            int j = i;
            boolean hasR = false;
            boolean hasB = false;
            while (j < n && s.charAt(j) != 'W') {
                if (s.charAt(j) == 'R') {
                    hasR = true;
                }
                if (s.charAt(j) == 'B') {
                    hasB = true;
                }
                j++;
            }
            int len = j - i;
            if (len == 1 || (!hasR || !hasB)) {
                return false;
            }
            i = j;
        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            System.out.println(canPrinted(s) ? "YES" : "NO");
        }
    }
}
