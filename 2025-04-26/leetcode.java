import java.util.*;

public class leetcode {

    // LeetCode Contest - Biweekly Contest 155
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < responses.size(); i++) {
            HashSet<String> set = new HashSet<>();
            for (int j = 0; j < responses.get(i).size(); j++) {
                set.add(responses.get(i).get(j));
            }
            for (String s : set) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        String ans = "";
        for (String key : map.keySet()) {
            if (max == map.get(key)) {
                if (ans.compareTo(key) < 0) {
                    ans = ans;
                } else {
                    ans = key;
                }
            }
            if (max < map.get(key)) {
                max = map.get(key);
                ans = key;
            }
        }
        return ans;
    }
}
