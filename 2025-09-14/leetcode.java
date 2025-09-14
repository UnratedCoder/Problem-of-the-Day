import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<String> exactWords = new HashSet<>();
        HashMap<String, String> caseInsensitive = new HashMap<>();
        HashMap<String, String> vowelError = new HashMap<>();
        for (String word : wordlist) {
            exactWords.add(word);
            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);
            String devoweled = devowel(lower);
            vowelError.putIfAbsent(devoweled, word);
        }
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (exactWords.contains(query)) {
                result[i] = query;
            } else {
                String lower = query.toLowerCase();
                if (caseInsensitive.containsKey(lower)) {
                    result[i] = caseInsensitive.get(lower);
                } else {
                    String devoweled = devowel(lower);
                    result[i] = vowelError.getOrDefault(devoweled, "");
                }
            }
        }
        return result;
    }
}
