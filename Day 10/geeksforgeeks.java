import java.util.ArrayList;
import java.util.Stack;

public class geeksforgeeks {

    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        s.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                list.add(i + 1);
            } else {
                list.add(i - s.peek());
            }
            s.push(i);
        }
        return list;
    }
}