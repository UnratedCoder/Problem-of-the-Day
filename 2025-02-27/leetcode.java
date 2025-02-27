public class leetcode {

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String toGoatLatin(String sentence) {
        String words[] = sentence.split(" ");
        String ch = "a";
        String ans = "";
        for (String el : words) {
            if (isVowel(Character.toLowerCase(el.charAt(0)))) {
                ans += el + "ma" + ch;
            } else {
                ans += el.substring(1) + el.charAt(0) + "ma" + ch;
            }
            ans += " ";
            ch = ch + "a";
        }
        return ans.substring(0, ans.length() - 1);
    }
}
