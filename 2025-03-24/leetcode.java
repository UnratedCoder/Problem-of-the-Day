import java.util.HashMap;

public class leetcode {

    public String decodeMessage(String key, String message) {
        int idx = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : key.toCharArray()) {
            if (!map.containsKey(ch) && ch != ' ') {
                map.put(ch, idx);
                idx++;
            }
        }
        StringBuilder sb = new StringBuilder(message);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch != ' ') {
                int j = map.get(ch);
                sb.setCharAt(i, (char) (j + 97));
            }
        }
        return sb.toString();
    }
}
