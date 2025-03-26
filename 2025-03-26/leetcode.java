public class leetcode {

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            count1 += i < s.length() / 2 && isVowel(Character.toLowerCase(s.charAt(i))) ? 1 : 0;
            count2 += i >= s.length() / 2 && isVowel(Character.toLowerCase(s.charAt(i))) ? 1 : 0;
        }
        return count1 == count2;
    }
}
