import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int countAtMostK(int arr[], int k) {
        // code here
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        while (right < arr.length) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            if (map.get(arr[right]) == 1) {
                k--;
            }
            while (k < 0) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    k++;
                }
                left++;
            }
            result += right - left + 1;
            right++;
        }
        return result;
    }
}