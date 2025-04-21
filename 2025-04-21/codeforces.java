import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int d = scan.nextInt();
            String s = scan.next();
            StringBuilder sb = new StringBuilder();
            boolean inserted = false;
            for (int i = 0; i < n; i++) {
                int curr = s.charAt(i) - '0';
                if (!inserted && curr < d) {
                    sb.append(d);
                    inserted = true;
                }
                sb.append(s.charAt(i));
            }
            if (!inserted) {
                sb.append(d);
            }
            System.out.println(sb);
        }
        scan.close();
    }
}