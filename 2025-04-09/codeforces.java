import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            count += s.charAt(i) == s.charAt(i + 1) ? 1 : 0;
        }
        System.out.println(count);
        scan.close();
    }
}