import java.util.*;

public class leetcode {

    // LeetCode Problem
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i - 1 - map.get(s.charAt(i)));
            } else {
                map.put(s.charAt(i), i);
            }
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (map.containsKey(ch) && distance[ch - 'a'] != map.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
