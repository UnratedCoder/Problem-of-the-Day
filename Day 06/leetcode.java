import java.util.ArrayList;

public class leetcode {

    public boolean areNumbersAscending(String s) {
        String word[] = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String w : word) {
            char ch = w.charAt(0);
            if (Character.isDigit(ch)) {
                list.add(Integer.parseInt(w));
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
