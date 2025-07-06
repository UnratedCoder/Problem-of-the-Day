import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static boolean isLucky(int n) {
        String num = Integer.toString(n);
        for (char ch : num.toCharArray()) {
            if (ch != '4' && ch != '7') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        int count = 0;
        for (char ch : n.toCharArray()) {
            if (ch == '4' || ch == '7') {
                count++;
            }
        }
        if (isLucky(count)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}