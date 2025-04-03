import java.util.*;

public class unstop {
    public static long full_stairs(long n) {
        // Write your logic here
        long ans = 0;
        long sum = 0;
        long count = 1;
        while (sum < n) {
            if (sum + count > n) {
                break;
            } else {
                sum += count;
                count++;
                ans++;
            }
        }
        return ans; // Placeholder return statement
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        // Call user logic function and print the output
        System.out.println(full_stairs(n));
    }
}