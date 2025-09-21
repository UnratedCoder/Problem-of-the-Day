import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    static int getMaxArea(int heights[]) {
        Stack<Integer> s = new Stack<>();
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                int top = s.pop();
                int width = s.isEmpty() ? i : i - s.peek() - 1;
                result = Math.max(result, heights[top] * width);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            int top = s.pop();
            int width = s.isEmpty() ? heights.length : heights.length - s.peek() - 1;
            result = Math.max(result, heights[top] * width);
        }
        return result;
    }

    static int maxArea(int mat[][]) {
        // code here
        int heights[] = new int[mat[0].length];
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            result = Math.max(result, getMaxArea(heights));
        }
        return result;
    }
}