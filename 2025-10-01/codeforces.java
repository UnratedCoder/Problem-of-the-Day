import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            boolean found = false;
            int[][] pairs = { { 1, 2 }, { 1, 4 }, { 2, 4 } };
            for (int[] pair : pairs) {
                int x = pair[0];
                int y = pair[1];
                int z = n - x - y;
                if (z > 0 && z != x && z != y && z % 3 != 0) {
                    System.out.println("YES");
                    System.out.println(x + " " + y + " " + z);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("NO");
            }
        }
    }
}
