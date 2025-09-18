import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int nge[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nge[i] = -1;
        }
        Stack<Integer> s = new Stack<>();
        for (int i = 2 * arr.length - 1; i >= 0; i--) {
            int curr = arr[i % arr.length];
            while (!s.isEmpty() && s.peek() <= curr) {
                s.pop();
            }
            if (i < arr.length && !s.isEmpty()) {
                nge[i] = s.peek();
            }
            s.push(curr);
        }
        for (int el : nge) {
            result.add(el);
        }
        return result;
    }
}