import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        for (int el : arr) {
            prefixSum += el;
            if (prefixSum == k) {
                count++;
            }
            int check = prefixSum - k;
            if (map.containsKey(check)) {
                count += map.get(check);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}