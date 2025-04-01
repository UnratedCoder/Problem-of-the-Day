import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                ans += '0';
            } else if (i + 1 < s.length() && s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
                ans += '2';
                i++;
            } else {
                ans += '1';
                i++;
            }
        }
        System.out.println(ans);
        scan.close();
    }
}