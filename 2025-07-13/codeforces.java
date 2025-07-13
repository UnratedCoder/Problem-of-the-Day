import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } else if (i % 4 == 0) {
                System.out.print('#');
                for (int j = 1; j < m; j++) {
                    System.out.print(".");
                }
            } else {
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }
}