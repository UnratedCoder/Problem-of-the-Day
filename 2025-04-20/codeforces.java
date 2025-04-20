import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            StringBuilder sb = new StringBuilder(s.toLowerCase());
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.deleteCharAt(i);
                    i--;
                }
            }
            if (sb.toString().equals("meow")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}