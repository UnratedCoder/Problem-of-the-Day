import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a < b && b < c) {
                System.out.println("STAIR");
            } else if (a < b && b > c) {
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        }
        scan.close();
    }
}