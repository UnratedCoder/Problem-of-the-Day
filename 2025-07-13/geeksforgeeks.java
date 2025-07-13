import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public TreeMap<Integer, int[]> map = new TreeMap<>();

    public void insert(int val) {
        Map.Entry<Integer, int[]> iteration = map.ceilingEntry(val);
        int len = 1;
        int sum = val;
        Map.Entry<Integer, int[]> previous = map.lowerEntry(val);
        if (previous != null) {
            len = previous.getValue()[0] + 1;
            sum = previous.getValue()[1] + val;
        }
        List<Integer> delete = new ArrayList<>();
        while (iteration != null) {
            if (iteration.getValue()[0] > len) {
                break;
            }
            delete.add(iteration.getKey());
            iteration = map.higherEntry(iteration.getKey());
        }
        for (int key : delete) {
            map.remove(key);
        }
        map.put(val, new int[] { len, sum });
    }

    public int nonLisMaxSum(int[] arr) {
        // code here
        map.clear();
        for (int val : arr) {
            insert(val);
        }
        int[] last = map.lastEntry().getValue();
        int totalSum = Arrays.stream(arr).sum();
        int sumLIS = last[1];
        return totalSum - sumLIS;
    }
}