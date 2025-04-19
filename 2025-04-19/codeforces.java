import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            int si = s.indexOf('1');
            int ei = s.lastIndexOf('1');
            int count = 0;
            for (int i = si + 1; i < ei; i++) {
                if (s.charAt(i) == '0') {
                    count++;
                }
            }
            System.out.println(count);
        }
        scan.close();
    }
}