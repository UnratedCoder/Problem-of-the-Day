import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static String userLogic(int n, String s) {
        // Write your logic here.
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        List<Character> oddChars = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddChars.add((char) (i + 'a'));
            }
        }
        String ans = "";
        if (oddChars.size() <= 1) {
            ans = "-1";
        } else {
            for (int i = 0; i < oddChars.size() - 1; i++) {
                ans += Character.toString(oddChars.get(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // First input is the integer N
        String s = scanner.next(); // Second input is the string
        scanner.close();

        // Call user logic function and print the output
        String result = userLogic(n, s);
        System.out.println(result);
    }
}