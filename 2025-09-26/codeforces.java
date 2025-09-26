import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long a = 1, b = 1, c = n - 2;
        if (c % 3 == 0) {
            a = 1;
            b = 2;
            c = n - 3;
        }
        if (c % 3 == 0) {
            a = 2;
            b = 2;
            c = n - 4;
        }
        System.out.println(a + " " + b + " " + c);
    }
}