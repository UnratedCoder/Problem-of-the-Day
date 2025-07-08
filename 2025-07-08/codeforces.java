import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static boolean hasDistinctYear(int year) {
        boolean digits[] = new boolean[10];
        while (year > 0) {
            int digit = year % 10;
            if (digits[digit]) {
                return false;
            }
            digits[digit] = true;
            year /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt() + 1;
        while (!hasDistinctYear(year)) {
            year++;
        }
        System.out.println(year);
    }
}