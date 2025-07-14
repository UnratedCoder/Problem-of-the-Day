import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumBase(int n, int k) {
        // Write your logic here.
        String toKthBase = Integer.toString(n, k);
        return getDigitSum(Integer.parseInt(toKthBase));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = sumBase(n, k);
        System.out.println(result);
    }
}