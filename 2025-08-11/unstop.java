import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int count_characters(List<String> words, String chars) {
        // Write your logic here.
        int[] charCount = new int[26];
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }
        int totalLength = 0;
        for (String word : words) {
            int[] wordCount = new int[26];
            for (char c : word.toCharArray()) {
                wordCount[c - 'a']++;
            }
            boolean canForm = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > charCount[i]) {
                    canForm = false;
                    break;
                }
            }
            if (canForm) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.next());
        }
        String chars = scanner.next();

        int result = count_characters(words, chars);
        System.out.println(result);
    }
}
