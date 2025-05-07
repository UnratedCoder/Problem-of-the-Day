import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int count = 0;
            for (int i = 1; i <= 9; i++) {
                int num = 0;
                for (int j = 1; j <= 9; j++) {
                    num = num * 10 + i;
                    if (num <= n) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
        scan.close();
    }
}