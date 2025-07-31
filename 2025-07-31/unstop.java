import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static void solve(int[] arr) {
        // Write your logic here.
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int id = arr[i];
            if (!first.containsKey(id)) {
                first.put(id, i);
            }
            last.put(id, i);
        }
        for (int i = 0; i < arr.length; i++) {
            int id = arr[i];
            int update = last.get(id) - first.get(id);
            arr[i] = update;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // First input is the integer N
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Remaining input is the array of integers
        }
        solve(arr);
        // Print the result as space-separated integers
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
