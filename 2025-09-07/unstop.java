import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    static String user_logic(int N, String A, String B) {
        // Write your logic here
        long a = Long.parseUnsignedLong(A, 2);
        long b = Long.parseUnsignedLong(B, 2);
        long aShifted = a << N;
        long bShifted = b >>> N;
        long result = aShifted + bShifted;
        return Long.toBinaryString(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // consume newline
        String A = sc.nextLine();
        String B = sc.nextLine();
        String result = user_logic(N, A, B);
        System.out.println(result);
    }
}
