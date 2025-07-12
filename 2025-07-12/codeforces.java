import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        int maxIdx = -1;
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            if (max < el) {
                max = el;
                maxIdx = i;
            }
            if (min >= el) {
                min = el;
                minIdx = i;
            }
        }
        int swaps = maxIdx + n - 1 - minIdx;
        if (maxIdx > minIdx) {
            swaps--;
        }
        System.out.println(swaps);
    }
}