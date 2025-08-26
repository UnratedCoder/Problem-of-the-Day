import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int x = scan.nextInt();
            int[] doors = new int[4];
            for (int i = 1; i <= 3; i++) {
                doors[i] = scan.nextInt();
            }
            int first = x;
            if (doors[first] == 0) {
                System.out.println("NO");
                continue;
            }
            int second = doors[first];
            if (doors[second] == 0) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
        scan.close();
    }
}