import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int length = 0;
        for (String el : words) {
            String reverse = new StringBuilder(el).reverse().toString();
            if (map.getOrDefault(reverse, 0) > 0) {
                map.put(reverse, map.get(reverse) - 1);
                length += 4;
            } else {
                map.put(el, map.getOrDefault(el, 0) + 1);
            }
        }
        for (String key : map.keySet()) {
            if (key.charAt(0) == key.charAt(1) && map.get(key) > 0) {
                length += 2;
                break;
            }
        }
        return length;
    }
}
