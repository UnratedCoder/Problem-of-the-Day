import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int numOfLegs = n / 4;
            if (n % 4 != 0) {
                numOfLegs++;
            }
            System.out.println(numOfLegs);
        }
    }
}