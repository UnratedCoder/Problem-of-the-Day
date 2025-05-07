import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[] check_times = new int[n];
        for (int i = 0; i < n; i++) {
            check_times[i] = sc.nextInt();
        }
        can_reach_home_on_time(n, x, y, z, check_times);
    }

    public static void can_reach_home_on_time(int n, int x, int y, int z, int[] check_times) {
        // Write your logic here
        int sum = 0;
        for (int el : check_times) {
            sum += el;
        }
        if (x >= sum + n * y + z) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}