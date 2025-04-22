import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            StringBuilder sb = new StringBuilder();
            for (char ch : s.toCharArray()) {
                if (ch == 'U') {
                    sb.append('D');
                } else if (ch == 'D') {
                    sb.append('U');
                } else {
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
        scan.close();
    }
}