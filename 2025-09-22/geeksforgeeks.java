import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length, 0));
        ArrayList<Integer> len = new ArrayList<>(Collections.nCopies(arr.length, 0));
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                int top = s.pop();
                int size = s.isEmpty() ? i : i - 1 - s.peek();
                len.set(top, size);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            int top = s.pop();
            int size = s.isEmpty() ? arr.length : arr.length - 1 - s.peek();
            len.set(top, size);
        }
        for (int i = 0; i < arr.length; i++) {
            int size = len.get(i) - 1;
            ans.set(size, Math.max(ans.get(size), arr[i]));
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            ans.set(i, Math.max(ans.get(i), ans.get(i + 1)));
        }
        return ans;
    }
}