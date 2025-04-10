import java.util.*;

public class leetcode {

    public String reverse(String s) {
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = temp;
        }
        return new String(ch);
    }

    public boolean isSubstringPresent(String s) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - 2; i++) {
            set.add(s.substring(i, i + 2));
        }
        for (int i = 0; i <= s.length() - 2; i++) {
            if (set.contains(reverse(s).substring(i, i + 2))) {
                return true;
            }
        }
        return false;
    }
}
