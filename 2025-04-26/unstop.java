import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int user_logic(String s) {
        // Write your logic here.
        char ch[] = s.toCharArray();
        int si = 0;
        int ei = ch.length - 1;
        while (si < ei) {
            if (isVowel(ch[si]) && isVowel(ch[ei])) {
                char temp = ch[si];
                ch[si] = ch[ei];
                ch[ei] = temp;
                si++;
                ei--;
            } else if (isVowel(ch[si]) && !isVowel(ch[ei])) {
                ei--;
            } else {
                si++;
            }
        }
        String rev = new String(ch);
        int count = 0;
        for (int i = 0; i <= rev.length() - 4; i++) {
            String temp = rev.substring(i, i + 4);
            if (temp.equals("code")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        // Call user logic function and print the output
        int result = user_logic(s);
        System.out.println(result);
    }
}