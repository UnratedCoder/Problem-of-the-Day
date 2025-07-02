import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, maxSize = 0;
        while (j < arr.length) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            while (map.size() > 2) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }
            maxSize = Math.max(maxSize, j - i + 1);
            j++;
        }
        return maxSize;
    }
}