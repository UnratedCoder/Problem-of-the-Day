import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void decode_sequences(int n, String word1, int m, String word2) {
        // Write your logic here.
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < n && idx < m) {
            sb.append(word1.charAt(idx));
            sb.append(word2.charAt(idx));
            idx++;
        }
        if (n > m) {
            sb.append(word1.substring(idx));
        } else if (m > n) {
            sb.append(word2.substring(idx));
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word1 = scanner.next();
        int m = scanner.nextInt();
        String word2 = scanner.next();
        scanner.close();
        decode_sequences(n, word1, m, word2);
    }
}