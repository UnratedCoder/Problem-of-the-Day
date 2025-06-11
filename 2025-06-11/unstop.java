import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static String reverseWords(String s) {
        // Write your logic here.
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            } else {
                sb.append(temp.reverse());
                temp = new StringBuilder();
                sb.append(" ");
            }
        }
        return sb.append(temp.reverse()).toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        String result = reverseWords(s);
        System.out.println(result);
    }
}