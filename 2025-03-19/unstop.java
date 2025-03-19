import java.util.*;

public class unstop {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void validateStackSequences(int[] pushed, int[] popped, boolean[] isValid, int[] primeCount) {
        Stack<Integer> s = new Stack<>();
        int idx = 0;
        for (int i = 0; i < pushed.length; i++) {
            s.push(pushed[i]);
            while (!s.isEmpty() && s.peek() == popped[idx]) {
                s.pop();
                idx++;
            }
        }
        int count = 0;
        for (int i = 2; i <= s.size(); i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        isValid[0] = s.isEmpty();
        primeCount[0] = count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] pushed = new int[n];
        int[] popped = new int[n];
        for (int i = 0; i < n; i++) {
            pushed[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            popped[i] = scanner.nextInt();
        }
        scanner.close();
        boolean[] isValid = new boolean[1];
        int[] primeCount = new int[1];
        validateStackSequences(pushed, popped, isValid, primeCount);
        if (isValid[0]) {
            System.out.println("true");
        } else {
            System.out.println("false");
            System.out.println(primeCount[0]);
        }
    }
}