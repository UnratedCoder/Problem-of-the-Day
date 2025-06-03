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
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int el : arr) {
            while (!q.isEmpty() && q.peek() <= el - 5000) {
                q.poll();
            }
            q.add(el);
            max = Math.max(max, q.size());
        }
        System.out.println(max);
    }
}