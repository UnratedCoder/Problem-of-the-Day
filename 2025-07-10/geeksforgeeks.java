import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public String longestString(String[] arr) {
        // code here
        Arrays.sort(arr, (a, b) -> {
            if (b.length() != a.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        String result = "";
        for (String word : arr) {
            boolean allPrefix = true;
            for (int i = 1; i < word.length(); i++) {
                if (!set.contains(word.substring(0, i))) {
                    allPrefix = false;
                    break;
                }
            }
            if (allPrefix) {
                result = word;
                break;
            }
        }
        return result;
    }
}