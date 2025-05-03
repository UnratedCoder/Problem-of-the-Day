public class leetcode {

    // LeetCode Problem
    public int longestSegment(String s, char c) {
        int maxSeg = 0;
        int count = 0;
        char prev = '#';
        for (char ch : s.toCharArray()) {
            if (ch == c && prev == '#') {
                count++;
                prev = c;
            } else if (ch == c && prev == c) {
                count++;
            } else {
                maxSeg = Math.max(maxSeg, count);
                count = 0;
                prev = '#';
            }
        }
        return Math.max(maxSeg, count);
    }

    public boolean checkZeroOnes(String s) {
        int cnt1 = longestSegment(s, '1');
        int cnt0 = longestSegment(s, '0');
        return cnt1 > cnt0;
    }
}
