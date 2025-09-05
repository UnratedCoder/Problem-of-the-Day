import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static String toExcelCol(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            num--;
            sb.append((char) ('A' + (num % 26)));
            num /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }
        int mask[] = new int[n];
        int length[] = new int[n];
        for (int i = 0; i < n; i++) {
            int m = 0;
            for (char c : arr[i].toCharArray()) {
                m |= (1 << (c - 'a'));
            }
            mask[i] = m;
            length[i] = arr[i].length();
        }
        int maxProd = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((mask[i] & mask[j]) == 0) {
                    int prod = length[i] * length[j];
                    maxProd = Math.max(maxProd, prod);
                }
            }
        }
        System.out.println(toExcelCol(maxProd));
    }
}
