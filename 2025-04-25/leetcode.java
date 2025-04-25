public class leetcode {

    // LeetCode Problem
    public int binaryGap(int n) {
        int maxDist = 0;
        char prev = '#';
        int idx = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && prev == '#') {
                prev = s.charAt(i);
                idx = i;
            } else if (s.charAt(i) == '1' && prev == '1') {
                maxDist = Math.max(maxDist, Math.abs(i - idx));
                idx = i;
            }
        }
        return maxDist;
    }
}
