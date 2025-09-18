import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int[] computeSecurityCodeIndex(int N, String[] securityStrings) {
        // Implement your logic here
        int maxCode = -1;
        int accountIndex = -1;
        for (int i = 0; i < N; i++) {
            String s = securityStrings[i];
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                int digit = s.charAt(j) - '0';
                int pos = j + 1;
                if (digit % 2 == 0) {
                    sum += digit * pos;
                } else {
                    sum -= digit * pos;
                }
            }
            int code = Math.abs(sum);
            if (code > maxCode) {
                maxCode = code;
                accountIndex = i;
            }
        }
        return new int[] { accountIndex + 1, maxCode };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] securityStrings = new String[N];
        for (int i = 0; i < N; i++) {
            securityStrings[i] = scanner.nextLine();
        }
        int[] result = computeSecurityCodeIndex(N, securityStrings);
        System.out.println(result[0] + " " + result[1]);
    }
}
