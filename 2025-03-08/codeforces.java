import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = scan.nextInt();
            a[i][1] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i][0] < a[i][1]) {
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}