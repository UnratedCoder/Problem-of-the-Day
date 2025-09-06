import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int s = scan.nextInt();
            int sum = 0;
            int count = 0;
            int current = 1;
            while (sum < s) {
                sum += current;
                current += 2;
                count++;
            }

            System.out.println(count);
        }
    }
}