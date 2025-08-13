import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void userLogic(int n, int k, List<Integer> heights) {
        // Write your logic here.
        for (int i = 0; i <= n - k; i++) {
            int high = -1;
            for (int j = i; j < i + k; j++) {
                high = Math.max(high, heights.get(j));
            }
            System.out.print(high + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            heights.add(scanner.nextInt());
        }
        userLogic(n, k, heights);
        // Assuming userLogic will print the result.
    }
}
