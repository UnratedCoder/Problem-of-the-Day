import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public String sortVowels(String s) {
        Set<Character> set = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        ArrayList<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                vowels.add(c);
            }
        }
        Collections.sort(vowels);
        StringBuilder result = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                result.append(vowels.get(idx++));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
