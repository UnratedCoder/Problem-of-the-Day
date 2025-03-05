import java.util.*;

public class geeksforgeeks {

    public int longestStringChain(String words[]) {
        // code here
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        HashMap<String, Integer> map = new HashMap<>();
        int ans = 1;
        for (String word : words) {
            map.put(word, 1);
            for (int i = 0; i < word.length(); i++) {
                String s = word.substring(0, i) + word.substring(i + 1);
                if (map.containsKey(s)) {
                    map.put(word, Math.max(map.get(word), map.get(s) + 1));
                }
            }
            ans = Math.max(ans, map.get(word));
        }
        return ans;
    }
}