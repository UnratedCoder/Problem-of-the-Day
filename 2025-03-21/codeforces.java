import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            boolean isContain = false;
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                if (a == k) {
                    isContain = true;
                }
            }
            if (isContain) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}