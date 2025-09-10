import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        Map<Integer, Set<Integer>> userLangMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            Set<Integer> langSet = new HashSet<>();
            for (int lang : languages[i]) {
                langSet.add(lang);
            }
            userLangMap.put(i + 1, langSet);
        }
        Set<Integer> needToTeach = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0], v = f[1];
            Set<Integer> langsU = userLangMap.get(u);
            Set<Integer> langsV = userLangMap.get(v);
            boolean canCommunicate = false;
            for (int lang : langsU) {
                if (langsV.contains(lang)) {
                    canCommunicate = true;
                    break;
                }
            }
            if (!canCommunicate) {
                needToTeach.add(u);
                needToTeach.add(v);
            }
        }
        int minToTeach = Integer.MAX_VALUE;
        for (int lang = 1; lang <= n; lang++) {
            int count = 0;
            for (int user : needToTeach) {
                if (!userLangMap.get(user).contains(lang)) {
                    count++;
                }
            }
            minToTeach = Math.min(minToTeach, count);
        }
        return minToTeach;
    }
}
