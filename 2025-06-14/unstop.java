import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static long compareBits(String a, String b) {
        // User logic goes here
        long ans = 0;
        for (int i = 0; i <= b.length() - a.length(); i++) {
            String sub = b.substring(i, i + a.length());
            int bit = 0;
            for (int j = 0; j < sub.length(); j++) {
                if (a.charAt(j) != sub.charAt(j)) {
                    bit++;
                }
            }
            ans += bit;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        System.out.println(compareBits(a, b));
    }
}