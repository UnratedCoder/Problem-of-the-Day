import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            if (s.equalsIgnoreCase("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}