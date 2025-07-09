import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int sumSubMins(int[] arr) {
        // code here
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        Stack<int[]> s1 = new Stack<>();
        Stack<int[]> s2 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (!s1.isEmpty() && s1.peek()[0] > arr[i]) {
                count += s1.pop()[1];
            }
            s1.push(new int[] { arr[i], count });
            left[i] = count;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int count = 1;
            while (!s2.isEmpty() && s2.peek()[0] >= arr[i]) {
                count += s2.pop()[1];
            }
            s2.push(new int[] { arr[i], count });
            right[i] = count;
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] * left[i] * right[i];
        }
        return result;
    }
}