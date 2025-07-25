public class leetcode {

    // LeetCode Problem
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int color1 = (coordinate1.charAt(0) - 'a' + coordinate1.charAt(1) - '1') % 2;
        int color2 = (coordinate2.charAt(0) - 'a' + coordinate2.charAt(1) - '1') % 2;
        return color1 == color2;
    }
}
