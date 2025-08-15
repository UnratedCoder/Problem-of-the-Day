import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int countBox[] = new int[46];
        for (int i = min; i <= max; i++) {
            int boxNum = getDigitSum(i);
            countBox[boxNum]++;
        }
        int maxCoins = 0;
        for (int el : countBox) {
            maxCoins = Math.max(maxCoins, el);
        }
        System.out.println(maxCoins);
    }
}
