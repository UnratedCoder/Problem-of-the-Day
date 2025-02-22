import java.util.Scanner;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            String first = s.substring(0, s.length() / 2);
            String second = s.substring(s.length() / 2);
            if (first.equals(second)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}