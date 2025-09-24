import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();
        int k5 = scan.nextInt();
        int k6 = scan.nextInt();
        int count256 = Math.min(k2, Math.min(k5, k6));
        k2 -= count256;
        int count32 = Math.min(k2, k3);
        int total = count256 * 256 + count32 * 32;
        System.out.println(total);
    }
}