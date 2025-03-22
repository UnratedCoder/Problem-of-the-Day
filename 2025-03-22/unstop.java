import java.util.*;

public class unstop {
    public static void userLogic(int n, int[] tasks, int T) {
        int sum = 0;
        int count = 0;
        for (int el : tasks) {
            if (sum + el > T) {
                break;
            } else {
                sum += el;
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tasks = new int[n];
        for (int i = 0; i < n; i++) {
            tasks[i] = scanner.nextInt();
        }
        int T = scanner.nextInt();
        scanner.close();
        userLogic(n, tasks, T);
    }
}