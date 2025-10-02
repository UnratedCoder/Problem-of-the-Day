import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            long totalDuration = a * 1 + b * 2 + c * 3;
            System.out.println(totalDuration % 2);
        }
    }
}
