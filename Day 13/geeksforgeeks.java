import java.util.Stack;

public class geeksforgeeks {

    Stack<Integer> s;
    int min;

    public geeksforgeeks() {
        s = new Stack<>();
        min = -1;
    }

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        if (s.isEmpty()) {
            min = x;
            s.push(x);
        } else if (x < min) {
            s.push(2 * x - min);
            min = x;
        } else {
            s.push(x);
        }
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        if (top < min) {
            min = 2 * min - top;
        }
    }

    // Returns top element of the Stack
    public int peek() {
        // code here
        if (s.isEmpty()) {
            return -1;
        }
        int top = s.peek();
        return min > top ? min : top;
    }

    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if (s.isEmpty()) {
            return -1;
        }
        return min;
    }
}