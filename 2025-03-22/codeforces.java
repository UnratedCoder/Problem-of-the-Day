import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x <= y) {
                System.out.println(x + " " + y);
            } else {
                System.out.println(y + " " + x);
            }
        }
        scan.close();
    }
}