public class leetcode {

    public String sortSentence(String s) {
        String words[] = s.split(" ");
        String sort[] = new String[words.length];
        for (String w : words) {
            int idx = w.charAt(w.length() - 1) - '0';
            sort[idx - 1] = w.substring(0, w.length() - 1);
        }
        String ans = sort[0];
        for (int i = 1; i < sort.length; i++) {
            ans += " " + sort[i];
        }
        return ans;
    }
}
