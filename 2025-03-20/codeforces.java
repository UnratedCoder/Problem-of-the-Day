import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            @SuppressWarnings("unused")
            int n = scan.nextInt();
            String s = scan.next();
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() > 1 && sb.charAt(0) != sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length() - 1);
            }
            System.out.println(sb.length());
        }
        scan.close();
    }
}