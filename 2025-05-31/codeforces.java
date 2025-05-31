import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int r = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 10; i++) {
            int total = k * i;
            if (total % 10 == 0 || total % 10 == r) {
                System.out.println(i);
                break;
            }
        }
    }
}