public class leetcode {

    // LeetCode Problem
    public boolean digitCount(String num) {
        int freq[] = new int[10];
        for (char ch : num.toCharArray()) {
            freq[ch - '0']++;
        }
        for (int i = 0; i < num.length(); i++) {
            int occur = num.charAt(i) - '0';
            if (freq[i] != occur) {
                return false;
            }
        }
        return true;
    }
}
