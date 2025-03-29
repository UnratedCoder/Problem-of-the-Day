import java.util.*;

public class geeksforgeeks {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 0));
        List<int[]> temp = new ArrayList<>();
        for (int i = 0; i < deadline.length; i++) {
            temp.add(new int[] { deadline[i], profit[i] });
        }
        temp.sort(Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int tem[] : temp) {
            if (tem[0] > pq.size()) {
                pq.add(tem[1]);
            } else if (!pq.isEmpty() && pq.peek() < tem[1]) {
                pq.poll();
                pq.add(tem[1]);
            }
        }
        while (!pq.isEmpty()) {
            list.set(1, list.get(1) + pq.poll());
            list.set(0, list.get(0) + 1);
        }
        return list;
    }
}