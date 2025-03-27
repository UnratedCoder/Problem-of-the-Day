import java.util.*;

public class geeksforgeeks {

    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int ans = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int j = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            while (j < arr.length && dep[j] < arr[i]) {
                count--;
                j++;
            }
            count++;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}