import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] change = new int[n];
        long max = 0;
        long curr = 0;
        for (int i = 0; i < n; i++) {
            change[i] = scanner.nextInt();
            curr += change[i];
            if (curr < 0) {
                curr = 0;
            }
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }
}