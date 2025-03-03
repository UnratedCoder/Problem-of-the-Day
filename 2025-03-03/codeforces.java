import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        if (x % 5 == 0) {
            System.out.println(x / 5);
        } else {
            System.out.println(x / 5 + 1);
        }
    }
}