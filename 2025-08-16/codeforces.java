import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            boolean found = false;
            for (int i = 1; i < n - 1; i++) {
                String a = s.substring(0, i);
                String b = s.substring(i, i + 1);
                String c = s.substring(i + 1);
                String ac = a + c;
                if (ac.contains(b)) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "Yes" : "No");
        }
    }
}