import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        while (k-- > 0) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n -= 1;
            }
        }
        System.out.println(n);
    }
}