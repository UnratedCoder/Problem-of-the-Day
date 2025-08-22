import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static String checkSymbolicStability(String S) {
        // User logic goes here
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : S.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        if (map.size() == 7) {
            for (int i = 0; i < S.length() - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1) || map.get(S.charAt(i)) % 2 == 1) {
                    return "UNSTABLE";
                }
            }
            return "STABLE";
        }
        return "UNSTABLE";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine(); // Read the entire line as input

        // Call the user logic function and print the result
        String result = checkSymbolicStability(S);
        System.out.println(result);

        scanner.close();
    }
}
