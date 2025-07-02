import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int longestBalancedFrequencySubarray(int[] arr) {
        // Write your logic here.
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < arr.length; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
                HashSet<Integer> set = new HashSet<>(map.values());
                if (set.size() == 1) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max; // Placeholder return value
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the size of the array

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt(); // Read the array elements
        }

        // Call user logic function and print the output
        int result = longestBalancedFrequencySubarray(arr);
        System.out.println(result);

        scanner.close();
    }
}