public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[] = text.split(" ");
        int count = 0;
        boolean isContain = false;
        for (String word : words) {
            for (char ch : brokenLetters.toCharArray()) {
                if (word.contains(Character.toString(ch))) {
                    isContain = true;
                    break;
                }
            }
            count += !isContain ? 1 : 0;
            isContain = false;
        }
        return count;
    }
}
