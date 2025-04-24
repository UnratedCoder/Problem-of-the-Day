import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> map = new HashMap<>();
        String code[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        char ch = 'a';
        for (String el : code) {
            map.put(ch++, el);
        }
        HashSet<String> set = new HashSet<>();
        for (String el : words) {
            String s = "";
            for (char c : el.toCharArray()) {
                s += map.get(c);
            }
            set.add(s);
        }
        return set.size();
    }
}
