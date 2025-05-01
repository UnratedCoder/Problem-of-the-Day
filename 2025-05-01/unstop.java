import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void makeMeLucky(String S, String U) {
        // Write your logic here.
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i <= sb.length() - U.length(); i++) {
            String sub = sb.substring(i, i + U.length());
            if (sub.equals(U)) {
                sb.delete(i, i + U.length());
                i = -1;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String U = scanner.next();
        scanner.close();
        makeMeLucky(S, U);
    }
}