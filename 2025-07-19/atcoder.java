import java.util.*;

public class atcoder {

    // Task A - Unsupported Type
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        for (int el : arr) {
            if (el == x) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    // Task B - Pick Two
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (count == 1) {
                    System.out.print(i + 1);
                    count++;
                } else if (count == 2) {
                    System.out.print("," + (i + 1));
                    count = 1;
                    System.out.println();
                }
            }
        }
    }
}