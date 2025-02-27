import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            int sum1 = 0;
            for (int i = 0; i < 3; i++) {
                sum1 += s.charAt(i) - '0';
            }
            int sum2 = 0;
            for (int i = 3; i < s.length(); i++) {
                sum2 += s.charAt(i) - '0';
            }
            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}