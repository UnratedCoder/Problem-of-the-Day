import java.util.Scanner;

public class atcoder {

    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        int length = scan.nextInt();
        if (password.length() >= length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] station = new int[n];
        for (int i = 0; i < n - 1; i++) {
            station[i] = scan.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int distance = 0;
            for (int j = i; j < n - 1; j++) {
                distance += station[j];
                System.out.print(distance + " ");
            }
            System.out.println();
        }
    }
}