import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void applyShifts(int n, String s, int[] shifts) {
        // Write your logic here.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int shift = shifts[i] % 26;
            char charShift = (char) ((ch - 'a' + shift) % 26 + 'a');
            sb.append(charShift);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int[] shifts = new int[n];
        for (int i = 0; i < n; i++) {
            shifts[i] = scanner.nextInt();
        }
        scanner.close();

        applyShifts(n, s, shifts);
    }
}
