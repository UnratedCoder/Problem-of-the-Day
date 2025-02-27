import java.util.Scanner;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            scan.nextInt();
            String s = scan.next();
            int max = Integer.MIN_VALUE;
            for (char ch : s.toCharArray()) {
                max = Math.max(max, ch - 'a' + 1);
            }
            System.out.println(max);
        }
        scan.close();
    }
}