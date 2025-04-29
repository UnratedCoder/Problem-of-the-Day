import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean isIdentical(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        char word[] = s.toCharArray();
        for (int i = 0; i < word.length / 2; i++) {
            if (word[i] != word[word.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int longestNonPalindromicSubstringLength(String s) {
        // Write your logic here.
        if (!isPalindrome(s)) {
            return s.length();
        } else if (isIdentical(s)) {
            return 0;
        } else {
            return s.length() - 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        int result = longestNonPalindromicSubstringLength(s);
        System.out.println(result);
    }
}