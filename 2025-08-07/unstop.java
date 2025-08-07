import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void decodeAlienLanguage(String s) {
        // Write your logic here to decode the alien language
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = getValue(s.charAt(i));
            int next = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;
            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();

        // Call user logic function and print the output
        decodeAlienLanguage(s);
    }
}
