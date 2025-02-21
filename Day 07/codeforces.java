import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != "codeforces".charAt(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scan.close();
    }
}