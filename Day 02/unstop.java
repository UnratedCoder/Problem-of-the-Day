import java.util.*;

public class unstop {
    public static int user_logic(int n, List<Integer> urns) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (Integer el : urns) {
            if (set.contains(el)) {
                count++;
            }
            set.add(el);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            List<Integer> urns = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                urns.add(scanner.nextInt());
            }

            // Call user logic function and store the result
            int result = user_logic(N, urns);
            results.add(result);
        }

        // Print all results for each test case
        for (int result : results) {
            System.out.println(result);
        }
        scanner.close();
    }
}