import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int countWorkersUnableToCollectParts(int[] workers, int[] parts) {
        // Write your logic here.
        Queue<Integer> q = new LinkedList<>();
        for (int worker : workers) {
            q.offer(worker);
        }
        int idx = 0;
        int count = 0;
        while (!q.isEmpty() && idx < parts.length) {
            int worker = q.poll();
            if (worker == parts[idx]) {
                idx++;
                count = 0;
            } else {
                q.offer(worker);
                count++;
            }
            if (count == q.size()) {
                break;
            }
        }
        return q.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] workers = new int[n];
        int[] parts = new int[n];
        for (int i = 0; i < n; i++) {
            workers[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            parts[i] = scanner.nextInt();
        }
        int result = countWorkersUnableToCollectParts(workers, parts);
        System.out.println(result);
    }
}
