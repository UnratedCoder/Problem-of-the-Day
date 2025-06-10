import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < n; i++) {
                int el = scan.nextInt();
                if (el == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }
            int weight = count1 + 2 * count2;
            if (weight % 2 != 0) {
                System.out.println("NO");
            } else {
                int half = weight / 2;
                if (half % 2 == 1 && count1 == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        scan.close();
    }
}