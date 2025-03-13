import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == b) {
                System.out.println(0);
            } else {
                if (Math.abs(b - a) % 10 == 0) {
                    System.out.println(Math.abs(b - a) / 10);
                } else {
                    System.out.println((Math.abs(b - a) / 10) + 1);
                }
            }
        }
        scan.close();
    }
}