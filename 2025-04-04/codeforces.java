import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int h = scan.nextInt();
            int m = scan.nextInt();
            System.out.println((23 - h) * 60 + (60 - m));
        }
        scan.close();
    }
}