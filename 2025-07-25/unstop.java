import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int userLogic(int a, int b) {
        // Write your logic here.
        int digit[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        int sum = a + b;
        int matchStick = 0;
        while (sum > 0) {
            int d = sum % 10;
            matchStick += digit[d];
            sum /= 10;
        }
        return matchStick;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // First input is the number of test cases
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            // Call user logic function
            int result = userLogic(A, B);
            results.add(result);
        }

        // Print all results
        for (int res : results) {
            System.out.println(res);
        }
    }
}