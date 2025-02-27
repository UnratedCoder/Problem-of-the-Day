import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a % b == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - a % b);
            }
        }
        scan.close();
    }
}