import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        boolean isHard = false;
        for (int el : a) {
            if (el == 1) {
                isHard = true;
                break;
            }
        }
        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
        scan.close();
    }
}