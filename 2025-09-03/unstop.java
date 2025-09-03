import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    private static boolean canKillAll(int enemy_groups[], int m, int k) {
        long totalMinutes = 0;
        for (int enemy : enemy_groups) {
            totalMinutes += (enemy + k - 1) / k;
            if (totalMinutes > m) {
                return false;
            }
        }
        return totalMinutes <= m;
    }

    public static void user_logic(int n, int[] enemy_groups, int m) {
        // Write your logic here.
        int low = 1, high = 0;
        for (int enemy : enemy_groups) {
            if (enemy > high) {
                high = enemy;
            }
        }
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canKillAll(enemy_groups, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (result == -1) {
            System.out.println("1");
        } else {
            System.out.println(result + " " + Integer.toOctalString(result));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] enemy_groups = new int[n];
        for (int i = 0; i < n; i++) {
            enemy_groups[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();

        user_logic(n, enemy_groups, m);
    }
}
