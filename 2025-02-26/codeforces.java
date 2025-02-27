import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = Math.max((a + (b * c)), Math.max((a + b) * c, Math.max(a * (b + c), Math.max(a * b * c, a + b + c))));
        System.out.println(max);
        scan.close();
    }
}