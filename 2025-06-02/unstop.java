import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int marks[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            marks[i] = scan.nextInt();
            map.put(marks[i], map.getOrDefault(marks[i], 0) + 1);
        }
        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        for (Integer val : map.values()) {
            minFreq = Math.min(minFreq, val);
            maxFreq = Math.max(maxFreq, val);
        }
        if (minFreq == maxFreq) {
            System.out.println(0);
        } else {
            System.out.println(maxFreq - minFreq);
        }
    }
}