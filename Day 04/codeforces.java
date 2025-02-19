import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 1; i < sb.length() - 2; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.deleteCharAt(i);
                }
            }
            System.out.println(sb);
        }
        scan.close();
    }
}