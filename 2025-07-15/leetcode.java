public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U';
    }

    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        int countVowel = 0;
        int countDigit = 0;
        int countConsonant = 0;
        int special = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isAlphabetic(ch)) {
                if (isVowel(ch)) {
                    countVowel++;
                } else {
                    countConsonant++;
                }
            } else if (Character.isDigit(ch)) {
                countDigit++;
            } else {
                special++;
            }
        }
        if (countVowel >= 1 && countConsonant >= 1 && countDigit >= 0 && special == 0) {
            return true;
        }
        return false;
    }
}
