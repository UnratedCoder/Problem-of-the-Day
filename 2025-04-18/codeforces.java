import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            String t = scan.next();
            int sum = 0;
            for (int i = 0; i < t.length() - 1; i++) {
                sum += Math.abs((s.indexOf(t.charAt(i)) + 1) - (s.indexOf(t.charAt(i + 1)) + 1));
            }
            System.out.println(sum);
        }
        scan.close();
    }
}