import java.util.*;

public class leetcode {

    // LeetCode Problem
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            if (set.contains(ch) && set.contains(Character.toLowerCase(ch))) {
                return String.valueOf(ch);
            }
        }
        return "";
    }
}
