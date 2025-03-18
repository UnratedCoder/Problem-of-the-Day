import java.util.*;

public class unstop {
    public static int countBits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {

            int bit = Integer.bitCount(i);
            count += bit;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read and parse the input
        scanner.close();
        // Call user logic function and print the output
        int result = countBits(n);
        System.out.println(result);
    }
}