import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> user_logic(int n, List<Integer> ages) {
        // Write your logic here.
        List<Integer> result = new ArrayList<>();
        for (Integer age : ages) {
            if (isPrime(age)) {
                result.add(age);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> ages = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ages.add(scanner.nextInt());
        }
        List<Integer> result = user_logic(n, ages);
        for (int age : result) {
            System.out.print(age + " ");
        }
    }
}
