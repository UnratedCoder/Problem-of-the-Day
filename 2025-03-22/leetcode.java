public class leetcode {

    public int maxPower(String s) {
        int max = 0;
        int count = 0;
        char prev = '$';
        for (char ch : s.toCharArray()) {
            if (prev == '$') {
                count++;
                prev = ch;
            } else if (prev == ch) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
                prev = ch;
            }
        }
        return Math.max(max, count);
    }
}
