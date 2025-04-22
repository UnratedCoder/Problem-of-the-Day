import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int userLogic(int n, String s) {
        // Write your logic here.
        int count = 0;
        for (int i = 0; i <= n - 4; i++) {
            count += s.substring(i, i + 4).equals("kill") ? 1 : 0;
        }
        return n - count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // First input is the integer n
        String s = scanner.next(); // Second input is the string S
        scanner.close();
        int result = userLogic(n, s);
        System.out.println(result);
    }
}