import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean isEvenSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum % 2 == 0;
    }

    // Placeholder function for user logic
    public static int[] countOddEvenDigitSums(int[] arr) {
        // User logic goes here
        int even = 0;
        int odd = 0;
        for (int el : arr) {
            if (isEvenSum(el)) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[] { odd, even };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = countOddEvenDigitSums(arr);
        System.out.println(result[0] + " " + result[1]);
    }
}