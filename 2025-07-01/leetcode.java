public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int possibleStringCount(String word) {
        int count = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
