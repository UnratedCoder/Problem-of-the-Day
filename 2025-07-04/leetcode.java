import java.util.*;

public class leetcode {

    // LeetCode Problem
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int row = 0;
            boolean isSameRow = true;
            for (char ch : words[i].toLowerCase().toCharArray()) {
                int currRow = row1.indexOf(ch) != -1 ? 1 : row2.indexOf(ch) != -1 ? 2 : 3;
                if (row == 0) {
                    row = currRow;
                } else {
                    if (row != currRow) {
                        isSameRow = false;
                        break;
                    }
                }
            }
            if (isSameRow) {
                list.add(words[i]);
            }
        }
        String result[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
