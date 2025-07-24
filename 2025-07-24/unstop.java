import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            if (i + 1 < n && isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1))) {
                int start = i;
                int count = 2;
                i += 2;
                while (i < n && isVowel(s.charAt(i))) {
                    count++;
                    i++;
                }
                sb.append(s, start, start + count);
                if (count == 2) {
                    sb.append('$');
                }
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        System.out.println(sb);
    }
}