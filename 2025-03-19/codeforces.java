import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            System.out.println(s.charAt(0) - '0' + s.charAt(2) - '0');
        }
        scan.close();
    }
}