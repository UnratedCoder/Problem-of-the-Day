import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int w = scan.nextInt();
        scan.close();
        int borrow = 0;
        for (int i = 1; i <= w; i++) {
            if (n < (i * k)) {
                borrow += i * k - n;
                n = 0;
            } else {
                n -= i * k;
            }
        }
        System.out.println(borrow);
    }
}