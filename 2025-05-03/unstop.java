import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int smallPrime(int n) {
        if (n % 2 == 0) {
            return 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public static int user_logic(int n) {
        // Write your logic here
        int count = 0;
        while (n > 0) {
            int prime = smallPrime(n);
            n -= prime;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        // Call user logic function and print the output
        int result = user_logic(n);
        System.out.println(result);
    }
}