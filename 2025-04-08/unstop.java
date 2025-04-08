import java.util.*;

public class unstop {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            pq.add(el * el);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
    }
}