import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int findLength(int[] color, int[] radius) {
        // code here
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < color.length; i++) {
            if (!s.isEmpty() && color[s.peek()] == color[i] && radius[i] == radius[s.peek()]) {
                s.pop();
            } else {
                s.push(i);
            }
        }
        return s.size();
    }
}