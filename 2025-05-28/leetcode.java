import java.util.*;

public class leetcode {

    // LeetCode Problem
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int maxVowelFreq = 0;
        int maxConsoFreq = 0;
        for (Character key : map.keySet()) {
            if (isVowel(key)) {
                maxVowelFreq = Math.max(maxVowelFreq, map.get(key));
            } else {
                maxConsoFreq = Math.max(maxConsoFreq, map.get(key));
            }
        }
        return maxVowelFreq + maxConsoFreq;
    }
}
