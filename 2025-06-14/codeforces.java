import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int maxProd = 0;
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 5 - i; j++) {
                    int k = 5 - i - j;
                    int A = a + i;
                    int B = b + j;
                    int C = c + k;
                    maxProd = Math.max(maxProd, A * B * C);
                }
            }
            System.out.println(maxProd);
        }
        scan.close();
    }
}