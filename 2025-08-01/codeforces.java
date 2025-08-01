import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int freq[] = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }
            String r = "";
            for (int i = 0; i < 26; i++) {
                if (freq[i] != 0) {
                    r += (char) (i + 'a');
                }
            }
            int len = r.length();
            HashMap<Character, Character> map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                map.put(r.charAt(i), r.charAt(len - 1 - i));
            }
            StringBuilder sb = new StringBuilder();
            for (char ch : s.toCharArray()) {
                sb.append(map.get(ch));
            }
            System.out.println(sb.toString());
        }
    }
}