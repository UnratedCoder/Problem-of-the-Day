import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int countTriangles(int arr[]) {
        // code here
        int count = 0;
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            int si = 0;
            int ei = i - 1;
            while (si < ei) {
                if (arr[si] + arr[ei] > arr[i]) {
                    count += ei - si;
                    ei--;
                } else {
                    si++;
                }
            }
        }
        return count;
    }
}