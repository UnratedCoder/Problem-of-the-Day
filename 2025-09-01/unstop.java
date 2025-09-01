import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static List<String> buildArray(int[] target, int n) {
        // User should implement their logic here
        List<String> result = new ArrayList<>();
        int idx = 0;
        for (int i = 1; i <= n && idx < target.length; i++) {
            if (i == target[idx]) {
                result.add("Push");
                idx++;
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // Read the number of elements in the target array

        int[] target = new int[m];
        for (int i = 0; i < m; i++) {
            target[i] = scanner.nextInt(); // Read elements of the target array
        }

        int n = scanner.nextInt(); // Read the integer N

        // Call the user logic function
        List<String> result = buildArray(target, n);

        // Print the result as a space-separated string
        for (String operation : result) {
            System.out.print(operation + " ");
        }
        System.out.println();
    }
}
