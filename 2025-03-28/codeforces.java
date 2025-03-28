import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            int a = 0;
            int b = 0;
            for (char ch : s.toCharArray()) {
                if (ch == 'a') {
                    a++;
                } else {
                    b++;
                }
            }
            if ((a % 2 == 0 || a % 3 == 0 || a % 5 == 0) && (b % 2 == 0 || b % 3 == 0 || b % 5 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}