import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int S = scan.nextInt();
        int count = 0;
        for (int i = 0; i <= K; i++) {
            for (int j = 0; j <= K; j++) {
                int check = S - i - j;
                if (check >= 0 && check <= K) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
