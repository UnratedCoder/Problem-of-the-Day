public class leetcode {

    // LeetCode Problem
    public int furthestDistanceFromOrigin(String moves) {
        int result = 0, d = 0;
        for (int i = 0; i < moves.length(); ++i) {
            if (moves.charAt(i) == 'L') {
                result--;
            }
            if (moves.charAt(i) == 'R') {
                result++;
            }
            if (moves.charAt(i) == '_') {
                d++;
            }
        }
        return Math.abs(result) + d;
    }
}
