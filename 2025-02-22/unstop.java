import java.util.*;

public class unstop {

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    static String checkWordBeauty(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return "WORD IS BEAUTIFUL";
        } else {
            return "WORD IS UGLY";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            words.add(scanner.next());
        }
        for (String word : words) {
            System.out.println(checkWordBeauty(word));
        }
        scanner.close();
    }
}
