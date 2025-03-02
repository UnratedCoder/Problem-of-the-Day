import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int count = 0;
        while (a <= b) {
            count++;
            a *= 3;
            b *= 2;
        }
        System.out.println(count);
    }
}