import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            String pie = "3141592653589793238462643383279502884197";
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == pie.charAt(i)) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
        scan.close();
    }
}