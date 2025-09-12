import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int b = scan.nextInt();
            int c = scan.nextInt();
            int h = scan.nextInt();
            int fillings = c + h;
            int usableFillings = Math.min(fillings, b - 1);
            int totalLayers = 2 * usableFillings + 1;
            System.out.println(totalLayers);
        }
    }
}