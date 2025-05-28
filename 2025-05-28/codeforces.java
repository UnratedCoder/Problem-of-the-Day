import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int currency[] = new int[n];
        int maxCurr = 0;
        for (int i = 0; i < n; i++) {
            currency[i] = scan.nextInt();
            maxCurr = Math.max(maxCurr, currency[i]);
        }
        scan.close();
        int equalCurr = 0;
        for (int el : currency) {
            if (el != maxCurr) {
                equalCurr += Math.abs(el - maxCurr);
            }
        }
        System.out.println(equalCurr);
    }
}