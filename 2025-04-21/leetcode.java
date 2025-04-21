import java.util.*;

public class leetcode {

    // LeetCode Problem
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            } else {
                set.add(ch);
            }
        }
        return '$';
    }
}
