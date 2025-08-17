import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = sc.next().charAt(0);

        int[] result = leastAbsoluteDiff(s, ch);
        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
    }

    public static int[] leastAbsoluteDiff(String s, char ch) {
        // Write your logic here.
        int n = s.length();
        int result[] = new int[n];
        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch) {
                prev = i;
            }
            result[i] = i - prev;
        }
        prev = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ch) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }
        return result;
    }
}
