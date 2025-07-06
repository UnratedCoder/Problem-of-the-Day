import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public void reverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        reverse(a);
        reverse(b);
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        HashSet<String> set = new HashSet<>();
        pq.offer(new int[] { a[0] + b[0], 0, 0 });
        set.add("0#0");
        while (result.size() < k && !pq.isEmpty()) {
            int top[] = pq.poll();
            int sum = top[0];
            int i = top[1], j = top[2];
            result.add(sum);
            if (i + 1 < a.length && !set.contains((i + 1) + "#" + j)) {
                pq.offer(new int[] { a[i + 1] + b[j], i + 1, j });
                set.add((i + 1) + "#" + j);
            }
            if (j + 1 < a.length && !set.contains(i + "#" + (j + 1))) {
                pq.offer(new int[] { a[i] + b[j + 1], i, j + 1 });
                set.add(i + "#" + (j + 1));
            }
        }
        return result;
    }
}