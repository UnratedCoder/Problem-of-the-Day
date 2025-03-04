import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num <= h) {
                sum += 1;
            } else if (num % h == 0) {
                sum += num / h;
            } else {
                sum += num / h + 1;
            }
        }
        scan.close();
        System.out.println(sum);
    }
}