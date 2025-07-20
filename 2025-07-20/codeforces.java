import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        if (n % 2 == 0) {
            count = n / 2;
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.print("2 ");
            }
        } else {
            count = (n - 3) / 2 + 1;
            System.out.println(count);
            System.out.print("3 ");
            for (int i = 1; i < count; i++) {
                System.out.print("2 ");
            }
        }
    }
}