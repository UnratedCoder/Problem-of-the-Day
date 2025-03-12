import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if ((a < b && b < c) || (c < b && b < a)) {
                System.out.println(b);
            } else if ((b < a && a < c) || (c < a && a < b)) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }
        scan.close();
    }
}