import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        String u = scan.next();
        scan.close();
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), t.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < u.length(); i++) {
            char ch = u.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append(map.get(ch));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append(Character.toUpperCase(map.get(Character.toLowerCase(ch))));
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);

    }
}