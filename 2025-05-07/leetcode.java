public class leetcode {

    // LeetCode Problem
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            count += ch == letter ? 1 : 0;
        }
        return count * 100 / s.length();
    }
}
