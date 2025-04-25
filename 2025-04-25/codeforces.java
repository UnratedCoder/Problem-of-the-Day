import java.util.*;

public class codeforces {

    public static boolean isIdentical(String s) {
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            if (isIdentical(s)) {
                System.out.println(-1);
            } else {
                System.out.println(s.length() - 1);
            }
        }
        scan.close();
    }
}