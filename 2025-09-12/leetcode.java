public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public boolean doesAliceWin(String s) {
        String vowels = "aeiou";
        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                return true;
            }
        }
        return false;
    }
}
