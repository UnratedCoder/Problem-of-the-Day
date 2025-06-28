import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (!first.containsKey(arr[i])) {
                first.put(arr[i], i);
            }
            last.put(arr[i], i);
        }
        for (int i = 0; i < n; i++) {
            int diff = last.get(arr[i]) - first.get(arr[i]);
            System.out.print(diff + " ");
        }
    }
}