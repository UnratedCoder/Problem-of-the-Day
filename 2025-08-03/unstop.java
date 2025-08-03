import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int user_logic(int n, int m, String[] strs) {
        /* Write your logic here. */
        int delete = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    delete++;
                    break;
                }
            }
        }
        return delete;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        int result = user_logic(n, m, strs);
        System.out.println(result);
    }
}
