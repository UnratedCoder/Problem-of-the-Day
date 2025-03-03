import java.util.*;

public class geeksforgeeks {

    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> min = new LinkedList<>();
        Deque<Integer> max = new LinkedList<>();
        int si = 0;
        int ei = 0;
        int start = 0;
        int end = 0;
        while (ei < arr.length) {
            while (!min.isEmpty() && arr[min.peekLast()] > arr[ei]) {
                min.pollLast();
            }
            while (!max.isEmpty() && arr[max.peekLast()] < arr[ei]) {
                max.pollLast();
            }
            min.addLast(ei);
            max.addLast(ei);
            while (arr[max.peekFirst()] - arr[min.peekFirst()] > x) {
                if (si == min.peekFirst()) {
                    min.pollFirst();
                }
                if (si == max.peekFirst()) {
                    max.pollFirst();
                }
                si++;
            }
            if (ei - si > end - start) {
                start = si;
                end = ei;
            }
            ei++;
        }
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}