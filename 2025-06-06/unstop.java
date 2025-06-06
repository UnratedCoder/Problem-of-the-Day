import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int sumDigitSq(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappyNumber(int n) {
        // Write your logic here
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = sumDigitSq(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        boolean result = isHappyNumber(n);
        System.out.println(result ? "true" : "false");
    }
}