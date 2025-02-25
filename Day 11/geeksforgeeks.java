import java.util.Stack;

public class geeksforgeeks {

    public static int getMaxArea(int arr[]) {
        // your code here
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        int top = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                top = s.pop();
                int width = s.isEmpty() ? i : i - s.peek() - 1;
                ans = Math.max(ans, arr[top] * width);
            }
            s.push(i);
        }
        int last = 0;
        while (!s.isEmpty()) {
            top = s.pop();
            last = arr[top] * (s.isEmpty() ? arr.length : arr.length - s.peek() - 1);
            ans = Math.max(ans, last);
        }
        return ans;
    }
}