import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int userLogic(int n, String s) {
        // Write your logic here.
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            String newStr = s.substring(0, i) + s.substring(i + 2);
            set.add(newStr);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        scanner.nextLine();

        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt(); // Length of the string
            String s = scanner.next(); // The string

            // Call user logic function and store the result
            int result = userLogic(n, s);
            results.add(result);
        }

        // Print all results for each test case
        for (int result : results) {
            System.out.println(result);
        }
    }
}
