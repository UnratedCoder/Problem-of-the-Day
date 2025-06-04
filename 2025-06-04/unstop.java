import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] jobs = new int[N][2];
        for (int i = 0; i < N; ++i) {
            jobs[i][0] = scanner.nextInt();
            jobs[i][1] = scanner.nextInt();
        }

        int result = min_rooms(jobs);
        System.out.println(result);
    }

    public static int min_rooms(int[][] jobs) {
        // User should implement their logic here
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(jobs[0][1]);
        for (int i = 1; i < jobs.length; i++) {
            int start = jobs[i][0];
            int end = jobs[i][1];
            if (!pq.isEmpty() && pq.peek() <= start) {
                pq.poll();
            }
            pq.add(end);
        }
        return pq.size();
    }
}