import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int user_logic(int[] arr) {
        // Write your logic here to find the substrate of the maximum and minimum value
        // in the array.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int el : arr) {
            min = Math.min(min, el);
            max = Math.max(max, el);
        }
        return Math.round((min + max) / 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Call user logic function and print the output
        int result = user_logic(arr);
        System.out.println(result);
    }
}