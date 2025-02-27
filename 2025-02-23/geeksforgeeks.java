import java.util.ArrayList;
import java.util.Stack;

public class geeksforgeeks {

    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = arr[s.peek()];
            }
            s.push(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int el : ans) {
            list.add(el);
        }
        return list;
    }
}