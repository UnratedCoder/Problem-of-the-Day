import java.util.*;

public class geeksforgeeks {

    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int el : arr) {
            pq.add(el);
        }
        int idx = arr.length - k;
        ArrayList<Integer> list = new ArrayList<>();
        int turn = 1;
        while (!pq.isEmpty()) {
            int num = pq.remove();
            if (turn > idx) {
                list.add(num);
            }
            turn++;
        }
        Collections.reverse(list);
        return list;
    }
}