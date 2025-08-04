import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean check_if_can_break(String s1, String s2) {
        // Write your logic here.
        if (s1.length() != s2.length()) {
            return false;
        }
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean s1BreakS2 = true;
        boolean s2BreakS1 = true;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] < ch2[i]) {
                s1BreakS2 = false;
            }
            if (ch2[i] < ch1[i]) {
                s2BreakS1 = false;
            }
        }
        return s1BreakS2 || s2BreakS1 ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine(); // First input line is string s1
        String s2 = scanner.nextLine(); // Second input line is string s2

        // Call user logic function and print the output
        boolean result = check_if_can_break(s1, s2);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
