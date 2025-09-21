import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int RepeatingOnes(String binary_string) {
        // Write your logic here.
        final int MOD = 1000000007;
        long total = 0, count = 0;
        for (char ch : binary_string.toCharArray()) {
            if (ch == '1') {
                count++;
            } else {
                total = (total + ((long) count * (count + 1)) / 2) % MOD;
                count = 0;
            }
        }
        if (count > 0) {
            total = (total + ((long) count * (count + 1)) / 2) % MOD;
        }
        return (int) total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String binary_string = reader.readLine().trim();

        int result = RepeatingOnes(binary_string);
        System.out.println(result);
    }
}
