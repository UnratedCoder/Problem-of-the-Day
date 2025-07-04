public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            StringBuilder temp = new StringBuilder("");
            for (int i = 0; i < word.length(); i++) {
                char next = word.charAt(i);
                if (next == 'z') {
                    temp.append('a');
                } else {
                    next += 1;
                    temp.append(next);
                }
            }
            word.append(temp);
        }
        return word.charAt(k - 1);
    }
}
