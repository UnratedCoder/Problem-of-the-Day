import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int findLargestNumber(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (Integer el : arr) {
            if (el < min) {
                min2 = min;
                min = el;
            } else if (el >= min && el < min2) {
                min2 = el;
            }
        }
        if (min + min2 == 0) {
            return 0;
        } else if (min >= min2) {
            return min * 10 + min2;
        } else {
            return min2 * 10 + min;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        // Call user logic function and print the output
        int result = findLargestNumber(arr);
        System.out.println(result);
    }
}