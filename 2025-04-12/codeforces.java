import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int si = s.indexOf('B');
            int ei = s.lastIndexOf('B');
            System.out.println(ei - si + 1);
        }
        scan.close();
    }
}