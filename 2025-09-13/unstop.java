import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static String canConvertToZero(String s) {
        // Write your logic here.
        String[] parts = s.split("-");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int sum = a + b + c;
        int max = Math.max(a, Math.max(b, c));
        int otherTwo = sum - max;
        if (sum % 2 == 0 && max <= otherTwo) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();

        // Call user logic function and print the output
        String result = canConvertToZero(s);
        System.out.println(result);
    }
}
