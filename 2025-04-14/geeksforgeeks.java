import java.util.*;

public class geeksforgeeks {

    // GfG 160 - 160 Days of Problem Solving (Day 152)
    public String findOrder(String[] words) {
        // code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int inDegree[] = new int[26];
        boolean exists[] = new boolean[26];
        for (int i = 0; i < 26; i++) {
            graph.add(new ArrayList<>());
        }
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                exists[ch - 'a'] = true;
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int len = Math.min(word1.length(), word2.length());
            int j = 0;
            while (j < len && word1.charAt(j) == word2.charAt(j)) {
                j++;
            }
            if (j < len) {
                int u = word1.charAt(j) - 'a';
                int v = word2.charAt(j) - 'a';
                graph.get(u).add(v);
                inDegree[v]++;
            } else if (word1.length() > word2.length()) {
                return "";
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            if (exists[i] && inDegree[i] == 0) {
                q.offer(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            int u = q.poll();
            sb.append((char) (u + 'a'));
            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    q.offer(v);
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (exists[i] && inDegree[i] != 0) {
                return "";
            }
        }
        return sb.toString();
    }
}