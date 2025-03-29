import java.util.*;

public class codeforces {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        @SuppressWarnings("unused")
        int n = scan.nextInt();
        String s = scan.next();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (i < sb.length() - 1 && isVowel(sb.charAt(i)) && isVowel(sb.charAt(i + 1))) {
                sb.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(sb);
        scan.close();
    }
}