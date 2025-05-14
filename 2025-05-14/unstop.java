import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void decodeMessage(String S) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < S.length()) {
            if (i + 2 < S.length() && S.charAt(i + 2) == '#') {
                int num = Integer.parseInt(S.substring(i, i + 2));
                sb.append((char) ('a' + num - 1));
                i += 3;
            } else {
                int num = S.charAt(i) - '0';
                sb.append((char) ('a' + num - 1));
                i++;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        scanner.close();
        // Call user logic function and print the output
        decodeMessage(S);
    }
}