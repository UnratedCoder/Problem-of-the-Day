import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        int si = 0;
        int ei = n - 1;
        int sereja = 0;
        int dima = 0;
        int turn = 1;
        while (si <= ei) {
            int num = 0;
            if (a[si] >= a[ei]) {
                num = a[si];
                si++;
            } else {
                num = a[ei];
                ei--;
            }
            if (turn % 2 != 0) {
                sereja += num;
            } else {
                dima += num;
            }
            turn++;
        }
        System.out.println(sereja + " " + dima);
    }
}