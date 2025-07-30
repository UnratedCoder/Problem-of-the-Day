public class leetcode {

    // LeetCode Problem
    public int minimizedStringLength(String s) {
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int count = 0;
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']--;
            if (freq[ch - 'a'] > 0) {
                count++;
            }
        }
        return s.length() - count;
    }
}
