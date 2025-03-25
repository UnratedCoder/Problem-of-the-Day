import java.util.Scanner;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a + b);
        }
        scan.close();
    }
}