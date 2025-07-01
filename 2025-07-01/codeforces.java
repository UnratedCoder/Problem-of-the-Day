import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            if (s.equals("abc")) {
                System.out.println("YES");
            } else if (s.charAt(0) == 'a' || s.charAt(1) == 'b' || s.charAt(2) == 'c') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}