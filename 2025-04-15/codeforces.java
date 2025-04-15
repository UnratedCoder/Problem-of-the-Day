import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        StringBuilder sb = new StringBuilder(s);
        if (sb.indexOf("xxx") == -1) {
            System.out.println(0);
            return;
        }
        int count = 0;
        while (sb.indexOf("xxx") != -1) {
            count++;
            int idx = sb.indexOf("xxx");
            sb.deleteCharAt(idx);
        }
        System.out.println(count);
    }
}