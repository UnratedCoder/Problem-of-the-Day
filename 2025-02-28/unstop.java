import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class unstop {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int len = scan.nextInt();
        if (n > len || n == 0) {
            System.out.println(0);
            return;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < len; i++) {
            pq.add(scan.nextInt());
        }
        scan.close();
        int idx = 0;
        while (!pq.isEmpty()) {
            int num = pq.remove();
            if (idx % n == 0) {
                sum += num;
            }
            idx++;
        }
        System.out.println(sum);
    }
}