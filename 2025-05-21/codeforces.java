import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int l = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        int d = scan.nextInt();
        int damagedDragons = 0;
        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                damagedDragons++;
            }
        }
        System.out.println(damagedDragons);
    }
}