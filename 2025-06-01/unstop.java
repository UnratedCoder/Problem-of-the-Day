import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static long fibonacci(int N) {
        // Write your logic here.
        long fib[] = new long[N + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[N];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        long result = fibonacci(N);
        System.out.println(result);
    }
}