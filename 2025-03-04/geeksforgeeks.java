import java.util.*;

public class geeksforgeeks {

    static int lis(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > list.get(list.size() - 1)) {
                list.add(arr[i]);
            } else {
                int low = Collections.binarySearch(list, arr[i]);
                if (low < 0) {
                    low = -(low + 1);
                }
                list.set(low, arr[i]);
            }
        }
        return list.size();
    }
}