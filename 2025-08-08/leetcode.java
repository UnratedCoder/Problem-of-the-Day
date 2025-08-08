public class leetcode {

    // LeetCode Problem
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int counter = 0;
        for (int sp : spaces) {
            sb.insert(sp + counter, " ");
            counter++;
        }
        return sb.toString();
    }
}
