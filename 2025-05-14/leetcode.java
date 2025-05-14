import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        for (String word : words) {
            boolean canContains = true;
            for (char ch : word.toCharArray()) {
                if (!set.contains(ch)) {
                    canContains = false;
                    continue;
                }
            }
            if (canContains) {
                count++;
            }
        }
        return count;
    }
}
