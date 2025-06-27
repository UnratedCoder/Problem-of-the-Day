import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void solve(String order, String s) {
        // Write your logic here
        StringBuilder sb = new StringBuilder();
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : order.toCharArray()) {
            int count = freq[ch - 'a'];
            freq[ch - 'a'] = 0;
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }
        for (int i = 0; i < 26; i++) {
            int count = freq[i];
            for (int j = 0; j < count; j++) {
                sb.append((char) (97 + i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.next(); // First part of the input is the order string
        String s = sc.next(); // Second part of the input is the string to be rearranged

        // Call user logic function and print the output
        solve(order, s);
    }
}