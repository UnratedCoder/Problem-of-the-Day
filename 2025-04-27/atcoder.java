import java.util.*;

public class atcoder {

    // Task A - Odd Position Sum
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            sum += i % 2 == 0 ? el : 0;
        }
        System.out.println(sum);
    }
}