import java.util.HashSet;

public class leetcode {

    // LeetCode Problem
    public String reverse(String s) {
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = temp;
        }
        return new String(ch);
    }

    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }
        int count = 0;
        for (String word : words) {
            set.remove(word);
            count += set.contains(reverse(word)) ? 1 : 0;
        }
        return count;
    }
}
