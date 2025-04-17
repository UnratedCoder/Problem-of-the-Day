import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String a = scan.next();
            String b = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                char ch = a.charAt(i);
                if (ch == 'p') {
                    b += 'q';
                } else if (ch == 'q') {
                    b += 'p';
                } else {
                    b += ch;
                }
            }
            System.out.println(b);
        }
        scan.close();
    }
}