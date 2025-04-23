import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            String t = scan.next();
            String u = scan.next();
            System.out.println(s.charAt(0) + "" + t.charAt(0) + "" + u.charAt(0));
        }
        scan.close();
    }
}