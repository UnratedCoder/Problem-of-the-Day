import java.util.*;

public class unstop {
    static int findSnoopDayIndex(int n, int[] arr) {
        // Write your logic here.
        int total = 0;
        for (int el : arr) {
            total += el;
        }
        int day = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if (curr + arr[i] >= total / 2f) {
                day = i + 1;
                break;
            }
            curr += arr[i];
        }
        return day;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int result = findSnoopDayIndex(n, arr);
        System.out.println(result);
    }
}