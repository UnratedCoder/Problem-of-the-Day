import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static long combinationOf3(int n) {
        return (long) n * (n - 1) * (n - 2) / 6;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        long pair = 0;
        for (Integer val : map.values()) {
            if (val >= 3) {
                pair += combinationOf3(val);
            }
        }
        System.out.println(pair);
    }
}
