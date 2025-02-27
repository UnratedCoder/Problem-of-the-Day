import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            char ch = scan.next().charAt(0);
            if ("codeforces".indexOf(ch) == -1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scan.close();
    }
}