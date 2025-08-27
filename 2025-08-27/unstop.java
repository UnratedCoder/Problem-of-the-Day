import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int find_the_winner(int n, int k) {
        // Write your logic here.
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }
        return result + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = find_the_winner(n, k);
        System.out.println(result);
    }
}
